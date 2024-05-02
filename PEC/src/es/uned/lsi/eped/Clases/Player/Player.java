package es.uned.lsi.eped.Clases.Player;

import es.uned.lsi.eped.DataStructures.ListIF;
import es.uned.lsi.eped.pract2023_2024.PlayerIF;
import es.uned.lsi.eped.pract2023_2024.TuneCollection;
import es.uned.lsi.eped.Clases.Player.PlayList.PlayList;

public class Player implements PlayerIF {

    private TuneCollection tunes;
    private PlayList playList;
    private int data;

    public Player(TuneCollection tunes, int data) {
        this.tunes = tunes;
        this.data = data;
    }

    @Override
    public ListIF<String> getPlayListIDs() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPlayListIDs'");
    }

    @Override
    public ListIF<Integer> getPlayListContent(String playListID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPlayListContent'");
    }

    @Override
    public ListIF<Integer> getPlayBackQueue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPlayBackQueue'");
    }

    @Override
    public ListIF<Integer> getRecentlyPlayed() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRecentlyPlayed'");
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

    @Override
    public void addListOfTunesToPlayList(String playListID, ListIF<Integer> lT) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addListOfTunesToPlayList'");
    }

    @Override
    public void addSearchToPlayList(String playListID, String t, String a, String g, String al, int min_y, int max_y,
            int min_d, int max_d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addSearchToPlayList'");
    }

    @Override
    public void removeTuneFromPlayList(String playListID, int tuneID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeTuneFromPlayList'");
    }

    @Override
    public void addListOfTunesToPlayBackQueue(ListIF<Integer> lT) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addListOfTunesToPlayBackQueue'");
    }

    @Override
    public void addSearchToPlayBackQueue(String t, String a, String g, String al, int min_y, int max_y, int min_d,
            int max_d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addSearchToPlayBackQueue'");
    }

    @Override
    public void addPlayListToPlayBackQueue(String playListID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addPlayListToPlayBackQueue'");
    }

    @Override
    public void clearPlayBackQueue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clearPlayBackQueue'");
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'play'");
    }

    
}
