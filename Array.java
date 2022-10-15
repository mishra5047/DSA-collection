package com.Anmol.Array;

import java.util.Arrays;

public class Array {
    private int length;
    private int[] array;
    private int counter=0;

    public Array(int length) {
        this.length = length;
        array = new int[this.length];
    }

    public void insert(int item){
        if (counter >= length ) {
        array = Arrays.copyOf(array,++length);
        }
        array[counter] = item;
        counter++;
    }
    public void removeAt(int index){
        if (counter - 1 - index >= 0) {
            System.arraycopy(array, index + 1, array, index, counter - 1 - index);
            array = Arrays.copyOf(array,counter-1);
        }
        counter--;
     }
    public void print(){
        System.out.println(Arrays.toString(array));
    }

    public int indexOf(int item){
        byte flag = 0;
        int i;
        for (i=0;i<counter;i++) {
            if (array[i] == item) {
                flag=1;
                break;
            }
        }
        if (flag ==1)
            return i;
        else
            return -1;
    }
}

