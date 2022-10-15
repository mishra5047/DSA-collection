
package com.Anmol.Queue;



import java.util.Arrays;


public class ArrayQueue {
class Stack {
    private int top;
    private int[] stack;

    public Stack(int length) {
        stack = new int[length];
        top = 0;
    }

    public void push(int element){
        if(top >= stack.length)
            throw new StackOverflowError();
        stack[top] = element;
        top++;
    }

    public int pop(){
        if (top==0) {
            System.out.println("StackUnder Flow");
            return -1;
        }
        top--;
        return stack[top];
    }

    public boolean isEmpty(){
        return top == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(stack);
    }
}

class ArrayQueue {
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


    public void dequeue() {

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

public class Main {

    public static void main(String[] args) {
        System.out.println("\nStack Operation");
        Stack stack = new Stack(5);
        System.out.println("Stack before Operations : " + stack);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.pop();
        stack.push(12);
        System.out.println("Stack after Operations : " + stack);

        System.out.println("\nQueue Operation");
        ArrayQueue queue = new ArrayQueue(6);
        System.out.println("Queue before Operations : " + queue);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(31);
        queue.enqueue(32);
        queue.enqueue(21);
        queue.dequeue();
        queue.dequeue();
        System.out.println("Queue after Operations : " + queue);
    }
}
