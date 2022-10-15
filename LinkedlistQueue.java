package com.Anmol.Queue;

public class LinkedlistQueue {
    private Node front;
    private Node rear;
    private int size;

    private static class Node {
        Object value;
        Node next;

        public Node(Object value) {
            this.value = value;
        }
    }

    public void enqueue(Object value) {
        var current = new Node(value);
        if (isEmpty()) {
            front = rear = current;
        }
        rear.next = current;
        rear = current;
        size++;
    }

    public void dequeue() {
        Node current = front;
        if (isEmpty()) throw new EmptyQueueException();
        front = front.next;
        current.next = null;
        size--;
    }

    public Object peek() {
        if (isEmpty()) throw new EmptyQueueException();
        return front.value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
