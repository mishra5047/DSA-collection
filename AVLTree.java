package com.Anmol.AVLTree;

public class AVLTree {
    private class AVLNode{
        private int value;
        private int height;
        private AVLNode left;
        private AVLNode right;

        public AVLNode(int value){
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

    AVLNode root ;

    public void insert(int value){
        root = insert(root, value);
    }
    private AVLNode insert(AVLNode root, int value){
        if (root == null) {
            return new AVLNode(value);
        }
        if(root.value > value)
            root.left = insert(root.left, value);
        else
            root.right = insert(root.right, value);

        root.height = Math.max(height(root.left),height(root.right))+1;

        return root;
    }
    
    private int height(AVLNode root){
        return (root == null) ? -1 : root.height;
    }
}
