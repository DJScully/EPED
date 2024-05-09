package es.uned.lsi.eped.pract2023_2024;

import es.uned.lsi.eped.DataStructures.*;

public class PlayListManager implements PlayListManagerIF {

    private ListIF<String> playLists;
    private ListIF<ListaParejas> lists;

    public PlayListManager() {
        playLists = new List<String>();
    }

    @Override
    public boolean contains(String playListID) {
        boolean found = false;
        for (int i = 0; i < this.playLists.size(); i++) {
            if (this.playLists.contains(playListID)) {
                found = true;
            }
        }
       return found;
    }

    @Override
    public PlayListIF getPlayList(String playListID) {
        PlayListIF play = null;
        if (contains(playListID)) {
            for (int i = 0; i < this.lists.size(); i++) {
                if (this.lists.get(i).getId().equals(playListID)) {
                    play = this.lists.get(i).getPlayList();
                    break;
                }
            }
        }
        return play;
    }

    @Override
    public ListIF<String> getIDs() {
        ListIF<String> play = new List<String>();
        for (int i = 0; i < this.lists.size(); i++) {
            play.insert(i, this.lists.get(i).getId());
        }
        return play;
    }

    @Override
    public void createPlayList(String playListID) {
        try {
            if(contains(playListID)) {
                throw new Exception("Ya existe una lista con ese ID");
            }
            else {
                this.playLists.insert(this.playLists.size(),playListID);
                this.lists.insert(this.playLists.size(),new ListaParejas(playListID));
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void removePlayList(String playListID) {
        try {
            if(contains(playListID)) {
                for (int i = 0; i < this.playLists.size(); i++) {
                    if (this.playLists.get(i).equals(playListID)) {
                        this.playLists.remove(i);
                        this.lists.remove(i);
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static class ListaParejas  {
        private String id;
        private PlayListIF playList;

        public ListaParejas(String id) {
            this.id = id;
            this.playList = new PlayList();
        }

        public String getId() {
            return this.id;
        }

        public PlayListIF getPlayList() {
            return this.playList;
        }
    }
    
}
