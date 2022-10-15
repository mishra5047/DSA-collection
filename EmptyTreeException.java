package com.Anmol.BinaryTree;

public class EmptyTreeException extends NullPointerException{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public String getMessage() {
        return "Tree is Empty";
    }
}
