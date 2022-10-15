package com.Anmol.HashTable;

import java.util.HashMap;
import java.util.Map;

public class FindCharter {
    char findCharter(String str) {
        int count;
        Map<Character, Integer> charMap = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            count = charMap.getOrDefault(ch, 0);
            charMap.put(ch, count + 1);
        }
        for (char ch : chars) {
            count = charMap.get(ch);
            if (count == 1)
                return ch;
        }
        return Character.MIN_VALUE;
    }
}
