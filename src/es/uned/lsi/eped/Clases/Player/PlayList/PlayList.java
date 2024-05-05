package es.uned.lsi.eped.Clases.Player.PlayList;

import es.uned.lsi.eped.DataStructures.*;
import es.uned.lsi.eped.pract2023_2024.PlayListIF;

public class PlayList implements PlayListIF{

    private ListIF<Integer> playList;

    public PlayList() {
       playList = new List<Integer>();
    }

    @Override
    public ListIF<Integer> getPlayList() {
        return this.playList;
    }

    @Override
    public void addListOfTunes(ListIF<Integer> lT) {
       IteratorIF<Integer> iterator = lT.iterator();

       while (iterator.hasNext()) {
            playList.insert(playList.size()+1, iterator.getNext());
       }
    }

    @Override
    public void removeTune(int tuneID) {
      
        for (int i = 0; i < playList.size(); i++) {
            if (playList.get(i) == tuneID) {
                playList.remove(i);
            }
        }
        
    }
    
}
