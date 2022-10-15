package com.Anmol.Array;

public class Main {

    public static void main(final String[] args) {
        final Array numbers = new Array(2);
        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(3);
        numbers.insert(5);
        numbers.insert(4);
        numbers.removeAt(0);
        numbers.print();
        System.out.println(numbers.indexOf(21));
        
    }
}
