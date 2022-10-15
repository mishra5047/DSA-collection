package com.Anmol.Stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CheckStringBalance {

    private final List<Character> leftBrackets = Arrays.asList('(','{','[','<');
    private final List<Character> rightBrackets = Arrays.asList(')','}',']','>');

    public boolean isBalanced(String orignal){
        Stack<Character> stack = new Stack<>();

        if (orignal == null)
            throw new IllegalArgumentException();

        for (char ch:orignal.toCharArray()){
            if(isLeftBracket(ch))
                stack.push(ch);
            if(isRightBracket(ch)){
               if (stack.empty()) return false;
               var top = stack.pop();
               if (!bracketsMatch(top,ch))
                   return false;
            }
        }
        return stack.empty();
    }
    private boolean isLeftBracket(char left) {
        return leftBrackets.contains(left);
    }
    private boolean isRightBracket(char right){
        return rightBrackets.contains(right);
    }
    private boolean bracketsMatch(char left, char right){
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }

}
