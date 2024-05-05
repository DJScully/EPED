package es.uned.lsi.eped.Clases.Player.BSTree;

import es.uned.lsi.eped.DataStructures.*;

public class BSTree extends BTree<Integer> implements BSTreeIF<Integer> {

    private BTree<Integer> root;
    public int PREORDER = 0; public int INORDER = 1; public int POSTORDER = 2; public int LRBREADTH = 3; public int RLBREADTH = 4;
    public BSTree(){
        super();
        root = null;
    }
    @Override
    public void add(Integer e) {
        try {
            if (root.contains(e)) {
               root.iterator(POSTORDER);
            }
        } catch (Exception error) {
            System.err.println("Error: " + error.getMessage());
        }
    }
    @Override
    public void remove(Integer e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
    @Override
    public Order getOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOrder'");
    }

  
   

}