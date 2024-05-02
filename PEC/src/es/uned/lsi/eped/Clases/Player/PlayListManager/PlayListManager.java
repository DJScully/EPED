package es.uned.lsi.eped.Clases.Player.PlayListManager;

import es.uned.lsi.eped.DataStructures.ListIF;
import es.uned.lsi.eped.pract2023_2024.PlayListIF;
import es.uned.lsi.eped.pract2023_2024.PlayListManagerIF;

public class PlayListManager implements PlayListManagerIF {

    @Override
    public boolean contains(String playListID) {
        boolean flag = false;
        try {
            
            return flag;
        } catch (Exception e) {
            return flag;        
        }
    }

    @Override
    public PlayListIF getPlayList(String playListID) {
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
