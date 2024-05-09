package es.uned.lsi.eped.pract2023_2024;

import es.uned.lsi.eped.DataStructures.List;
import es.uned.lsi.eped.DataStructures.ListIF;

public class Player implements PlayerIF {

    private TuneCollection tunes;
    private RecentlyPlayed recentlyPlayed;
    private PlayListManager playListManager;
    private PlayBackQueue playBackQueue;

    public Player(TuneCollection tunes, int maximo) {
        this.tunes = tunes;
        this.recentlyPlayed = new RecentlyPlayed(maximo);
        this.playListManager = new PlayListManager();
        this.playBackQueue = new PlayBackQueue();
    }

    @Override
    public ListIF<String> getPlayListIDs() {
        return playListManager.getIDs();
    }

    @Override
    public ListIF<Integer> getPlayListContent(String playListID) {
        return this.playListManager.getPlayList(playListID).getPlayList();
    }

    @Override
    public ListIF<Integer> getPlayBackQueue() {
        return this.playBackQueue.getContent();
    }

    @Override
    public ListIF<Integer> getRecentlyPlayed() {
        return this.recentlyPlayed.getContent();
    }

    @Override
    public void createPlayList(String playListID) {
        this.playListManager.createPlayList(playListID);
    }

    @Override
    public void removePlayList(String playListID) {
        this.playListManager.removePlayList(playListID);
    }

    @Override
    public void addListOfTunesToPlayList(String playListID, ListIF<Integer> lT) {
        this.playListManager.getPlayList(playListID).addListOfTunes(lT);
    }

    @Override
    public void addSearchToPlayList(String playListID, String t, String a, String g, String al, int min_y, int max_y,
            int min_d, int max_d) {
            ListIF<Tune> pl = new List<Tune>();
            Query q = new Query(t, a, g, al, min_y, max_y, min_d, max_d);
            for (int i = 0; i < this.playListManager.getPlayList(playListID).getPlayList().size(); i++) {
                if (tunes.getTune(this.playListManager.getPlayList(playListID).getPlayList().get(i)).match(q)) {
                    //this.playListManager.getPlayList(playListID).addTune(i);
                    pl.insert(i, tunes.getTune(this.playListManager.getPlayList(playListID).getPlayList().get(i)));
                   
                }
            }
            this.playListManager.getPlayList(playListID).getPlayList().size();
    }

    @Override
    public void removeTuneFromPlayList(String playListID, int tuneID) {
        this.playListManager.getPlayList(playListID).removeTune(tuneID);
    }

    @Override
    public void addListOfTunesToPlayBackQueue(ListIF<Integer> lT) {
        this.playBackQueue.addTunes(lT);
    }

    @Override
    public void addSearchToPlayBackQueue(String t, String a, String g, String al, int min_y, int max_y, int min_d,
            int max_d) {
        ListIF<Tune> pl = new List<Tune>();
        Query q = new Query(t, a, g, al, min_y, max_y, min_d, max_d);
        for (int i = 0; i < playBackQueue.getContent().size(); i++) {
            if (tunes.getTune(this.playBackQueue.getContent().get(i)).match(q)) {
                pl.insert(i, tunes.getTune(this.playBackQueue.getContent().get(i)));
            }
        }
    }

    @Override
    public void addPlayListToPlayBackQueue(String playListID) {
        PlayListIF p = this.playListManager.getPlayList(playListID);
        this.playBackQueue.addTunes(p.getPlayList());
    }

    @Override
    public void clearPlayBackQueue() {
        this.playBackQueue.clear();
    }

    @Override
    public void play() {
        if (!this.playBackQueue.isEmpty()) {
            int id = this.playBackQueue.getFirstTune();
            this.recentlyPlayed.addTune(id);
        }
    }

    
}
