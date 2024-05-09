package es.uned.lsi.eped.pract2023_2024;

import es.uned.lsi.eped.DataStructures.*;

public class RecentlyPlayed implements RecentlyPlayedIF {

    private ListIF<Integer> playLists;
    private ListIF<TuneIF> lista;
    private TuneCollectionIF collection;
    private int maximo;

    public RecentlyPlayed(int maximo) {
        playLists = new List<Integer>();
    }

    @Override
    public ListIF<Integer> getContent() {
        ListIF<Integer> l = new List<Integer>();
        for (int i = this.maximo; i >= 0; i--){
            l.insert(i, playLists.get(i));
        }
        return l;
    }

    @Override
    public void addTune(int tuneID) {
        if (lista.size() <= this.maximo ) {
            lista.insert(tuneID,  collection.getTune(tuneID));
        } else {
            for (int i = this.maximo - 1; i >= 0; i--){
                TuneIF t = collection.getTune(playLists.get(i));
                lista.remove(i);
                lista.insert(i, t);
            }
            lista.insert(tuneID,  collection.getTune(tuneID));
        }
    }
    
}
