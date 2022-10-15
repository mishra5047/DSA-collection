package com.Anmol.Stack;

public class Main {
    public static void main(String[] args){
        StackWithTwoQueues<Integer> stack = new StackWithTwoQueues<>();
        stack.push(3);
        stack.push(5);
        stack.push(1);
        stack.push(6);
        var peek = stack.peek();
        stack.pop();
        var value = stack.pop();
        System.out.println(peek);
        System.out.println(value);
        System.out.println(stack);
        System.out.println(stack.isEmpty());
    }
}
