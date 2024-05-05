package es.uned.lsi.eped.Clases.Player.PlayListManager;

import es.uned.lsi.eped.Clases.Player.PlayList.PlayList;
import es.uned.lsi.eped.DataStructures.*;
import es.uned.lsi.eped.pract2023_2024.*;

public class PlayListManager implements PlayListManagerIF {

    private PlayListIF playlists;

    public PlayListManager() {
        playlists = new PlayList();
    }

    @Override
    public boolean contains(String playListID) {
        boolean contains = false;
        this.playlists.getPlayList();
        
       return contains;
    }

    @Override
    public PlayListIF getPlayList(String playListID) {
        boolean contains = false;
        this.playlists.getPlayList().iterator();
        while ( this.playlists.getPlayList().iterator().hasNext()) {
            if (this.playlists.getPlayList().iterator().getNext().equals(Integer.parseInt(playListID))) {
                contains =  true;break;
            }
       }
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPlayList'");
    }

    @Override
    public ListIF<String> getIDs() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIDs'");
    }

    @Override
    public void createPlayList(String playListID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPlayList'");
    }

    @Override
    public void removePlayList(String playListID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removePlayList'");
    }
    
}
