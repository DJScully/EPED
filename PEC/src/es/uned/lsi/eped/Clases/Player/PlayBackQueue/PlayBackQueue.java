package es.uned.lsi.eped.Clases.Player.PlayBackQueue;

import es.uned.lsi.eped.DataStructures.*;
import es.uned.lsi.eped.pract2023_2024.*;

public class PlayBackQueue implements PlayBackQueueIF{

    private List<Integer> lista;

    public PlayBackQueue() {
        this.lista = new List<Integer>();
    }

    @Override
    public ListIF<Integer> getContent() {
        return this.lista;
    }

    @Override
    public boolean isEmpty() {
        boolean empty = false;
        if (this.lista.size() != 0) {
            return empty;
        } else{
            empty = true;
            return empty;
        }
    }

    @Override
    public int getFirstTune() {
        int id = 0;
        for (int i = 1; i <= this.lista.size(); i++) {
            id = i;
        }

        return id;
    }

    @Override
    public void extractFirstTune() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'extractFirstTune'");
    }

    @Override
    public void addTunes(ListIF<Integer> lT) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addTunes'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }
    
}
