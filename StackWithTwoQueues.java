package com.Anmol.Stack;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

public class StackWithTwoQueues<T> {
    private Queue<T> queue1 = new LinkedList<>();
    private Queue<T> queue2 = new LinkedList<>();
    private int size;

    public void push(T item) {
        queue1.add(item);
        size++;
    }

    public T pop() {
        if (queue1.isEmpty())
            throw new EmptyStackException();
        size--;
        return popT();
    }


    public T peek() {
        if (queue1.isEmpty())
            throw new EmptyStackException();
        return peekT();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private T popT() {
        for (int i = 0; i < size; i++) {
            queue2.add(queue1.remove());
        }
        var value = queue1.remove();
        queue1.addAll(queue2);
        queue2.clear();
        return value;
    }

    private T peekT() {
        for (int i = 0; i < size - 1; i++) {
            queue2.add(queue1.remove());
        }
        var value = queue1.remove();
        queue2.add(value);
        queue1.addAll(queue2);
        queue2.clear();
        return value;
    }

    @Override
    public String toString() {
        return queue1.toString();
    }
}
