package com.Anmol.BinaryTree;

public class Tree {
    private Node root;
    private class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

    void insert(int value) {
        var node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        var current = root;
        while (true) {
            if (current.value < value) {
                if (current.right == null) {
                    current.right = node;
                    break;
                }
                current = current.right;
            }
            else {
                if (current.left == null) {
                    current.left = new Node(value);
                    break;
                }
                current = current.left;
            }
        }
    }

    boolean find(int value){
        var current = root;
        if(current == null)
            throw new EmptyTreeException();
        while(current != null) {
            if (current.value == value)
                return true;
            if(current.value > value)
                current = current.left;
            else
                current = current.right;
        }
        return false;
    }

    public void traversalPreOrder(){
        traversalPreOrder(root);
    }
    private void traversalPreOrder(Node root){
        if(root == null)
            return;

        System.out.print(root.value + " ");
        traversalPreOrder(root.left);
        traversalPreOrder(root.right);
    }

    public void traversalInOrder(){
        traversalInOrder(root);
    }
    private void traversalInOrder(Node root){
        if(root == null)
            return;

        traversalPreOrder(root.left);
        System.out.print(root.value + " ");
        traversalPreOrder(root.right);
    }

    public void traversalPostOrder(){
        traversalPostOrder(root);
    }
    private void traversalPostOrder(Node root){
        if(root == null)
            return;

        traversalPreOrder(root.left);
        traversalPreOrder(root.right);
        System.out.print(root.value + " ");
    }

    public boolean equals(Tree other){
        if (other == null)
            return false;
        return equals(root,other.root);
    }
    private boolean equals(Node first, Node second){
        if (first == null && second == null)
            return true;
        if (first != null && second != null)
            return first.value == second.value &&
                    equals(first.left, second.left) &&
                    equals(first.right, second.right);
        return false;
    }

    // for Binary Tree
    public int min() {
        var current = root;
        if (current == null)
            return -1;
        while (current.left != null)
            current = current.left;
        return current.value;
    }

    public int height(){
        return height(root);
    }
    private int height(Node root){
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 0;

        return 1+ Math.max(
                height(root.left),
                height(root.right));
    }

    //    For any tree
    public int minValue(){
        return min(root);
    }
    private int min(Node root){
        if (root == null)
            return Integer.MAX_VALUE;

        if(root.left == null && root.right == null)
            return root.value;

        var left = min(root.left);
        var right = min(root.right);

        return Math.min(Math.min(left,right),root.value);
    }

    public void swapRoot(){
        root.left = root.right;
        root.right = root.left;
    }

    public boolean checkBinary(){
        return checkBinary(root,
                Integer.MIN_VALUE,
                Integer.MAX_VALUE);
    }
    private boolean checkBinary(Node root, int min, int max){
        if(root == null)
            return true;
        if(root.value < min || root.value > max)
            return false;

        return
                checkBinary(root.left,min,root.value+1)
                && checkBinary(root.right,root.value+1,max);

    }

    public void printAtDistance(int distance){
        printAtDistance(root,distance);
    }
    private void printAtDistance(Node root,int distance){
        if (root == null)
            return;

        if(distance == 0){
            System.out.println(root.value);
        }
        printAtDistance(root.left,distance-1);
        printAtDistance(root.right,distance-1);
    }

    public void orderTraversal(){
        for (var i = 0;i<=height();i++)
            printAtDistance(i);
    }

}

