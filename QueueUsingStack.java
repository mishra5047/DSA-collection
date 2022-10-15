package com.Anmol.Queue;


import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> stackPush = new Stack<>();
    private Stack<Integer> stackPop = new Stack<>();

    public void enqueue(int item) {
        stackPush.push(item);
    }

    public int dequeue() {
        if (stackPush.isEmpty() && stackPop.isEmpty())
            throw new IllegalStateException();
        MoveStackPushToStackPop();
        return stackPop.pop();
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();
        MoveStackPushToStackPop();
        return stackPop.peek();
    }

    private void MoveStackPushToStackPop() {
        if (stackPop.isEmpty())
            while (!stackPush.isEmpty())
                stackPop.push((stackPush.pop()));
    }

    @Override
    public String toString() {
        return (stackPush.toString().replace("]", "") + ", " + stackPop.toString().replace("[", ""));
    }

    public boolean isEmpty() {
        return stackPush.isEmpty() && stackPop.isEmpty();
    }
}
