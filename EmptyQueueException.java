package com.Anmol.Queue;


public class EmptyQueueException extends NullPointerException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public String getMessage() {
        return "Queue is Empty";
    }
}
