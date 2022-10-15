package com.Anmol.Stack;

import java.util.EmptyStackException;

public class Stack {
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
        if (top==0)
            throw new EmptyStackException();
        top--;
        return stack[top];
    }

    public int peek(){
        if(top == 0)
            throw new EmptyStackException();
        return stack[top];
    }

    public boolean isEmpty(){
        return top == 0;
    }

}
