package com.Anmol.Queue;


import java.util.Arrays;

public class ArrayQueue {
    private int[] queue;
    private int front = 0;
    private int rear = 0;
    private int count = 0;

    public ArrayQueue(int length) {
        queue = new int[length];
    }

    public void enqueue(int element) {
        if (count == queue.length)
            throw new IllegalStateException();
        queue[rear] = element;
        rear = (rear + 1) % queue.length;
        count++;

    }

    public int dequeue() {
        if (count == 0)
            throw new IllegalStateException();
        var value = queue[front];
        queue[front] = 0;
        front = (front + 1) % queue.length;
        count--;
        return value;
    }

    public int peek() {
        if (front == rear)
            throw new IllegalStateException();
        return queue[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == queue.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
}
