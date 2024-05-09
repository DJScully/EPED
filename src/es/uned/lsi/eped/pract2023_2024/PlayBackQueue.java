package es.uned.lsi.eped.pract2023_2024;

import es.uned.lsi.eped.DataStructures.*;

public class PlayBackQueue implements PlayBackQueueIF{

    private Queue<PlayListIF> cola;


    public PlayBackQueue() {

        this.cola = new Queue<PlayListIF>();

    }

    @Override
     public ListIF<Integer> getContent() {
       ListIF<Integer> l = new List<Integer>();
        try {
            if (!cola.isEmpty()) {
                l = cola.getFirst().getPlayList();
            }
        } catch (Exception e) {
            l = new List<Integer>();
        }
        return l;
    }

    @Override
    public boolean isEmpty() {
       return cola.isEmpty();
    }

    @Override
    public int getFirstTune() {
        int tune = 0;
        try {
            if (!cola.isEmpty()) {
                tune = cola.getFirst().getPlayList().get(0);
            }
        } catch (Exception e) {
            tune = 0;
        }

        return tune;
    }

    @Override
    public void extractFirstTune() {
       
        try {
            if (!cola.isEmpty()) {
                cola.getFirst().removeTune(cola.getFirst().getPlayList().size());;
            }
        } catch (Exception e) {
           System.err.println("Error: " + e.getMessage());
        } 

    }

    @Override
    public void addTunes(ListIF<Integer> lT) {
        PlayList pl = new PlayList();
        pl.addListOfTunes(lT);
        this.cola.enqueue(pl);
    }

    @Override
    public void clear() {
        this.cola.clear();
    }

  
}