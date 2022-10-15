package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class umbrella {

    public static int countCJJC(String str, int X, int Y){
        int cntCJ = 0;
        int cntJC = 0;
        for(int i = 0; i < str.length() - 1; i++){

            if(str.substring(i , i + 2).equals("CJ")){
                cntCJ++;
            }else if (str.substring(i , i + 2).equals("JC")){
                cntJC++;
            }
        }
        return X*cntCJ + Y*cntJC;
    }
    static int minCost = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = scn.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int x = 1; x <= t; ++x) {
            minCost = Integer.MAX_VALUE;
            int X = scn.nextInt();
            int Y = scn.nextInt();
            String str = scn.next();
            findCost(0,str,X,Y,"");

            System.out.println("Case #" + x + ": " +  minCost);
        }
    }
    public static void findCost(int i, String str, int X, int Y, String asf){
        if(i == str.length()){
            minCost = Math.min(countCJJC(asf, X, Y), minCost);
            return;
        }
        char ch = str.charAt(i);
        if(ch == '?'){
            findCost(i + 1, str,X,Y, asf + "C");
            findCost(i + 1, str,X,Y, asf + "J");
        }else{
            findCost(i + 1, str,X,Y, asf + ch);
        }
    }
    public static int tfindCost( String str, int X, int Y){
        StringBuilder nstr = new StringBuilder(str);
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '?'){
                char nchar = '?';
                int temp = i + 1;
                while(temp < str.length() && nchar == '?'){
                    nchar = str.charAt(temp);
                    temp++;
                }
                if(nchar == '?'){
                    nstr.setCharAt(i, 'C');
                }else{
                    nstr.setCharAt(i, nchar);
                }
            }else{
                nstr.setCharAt(i, ch);
            }
        }
        return countCJJC(nstr.toString(), X,Y);
    }

}
