package com.Anmol.Stack;

import java.util.Stack;

public class ReverseString {

    public String reverseString(String orignal){
        StringBuffer reverse = new StringBuffer();

        Stack<Character> stack = new Stack<>();

        if (orignal == null)
            throw new IllegalArgumentException();

        for (char ch:orignal.toCharArray() )
            stack.push(ch);

        while (!stack.empty())
            reverse.append(stack.pop());

    return reverse.toString();
    }


}
