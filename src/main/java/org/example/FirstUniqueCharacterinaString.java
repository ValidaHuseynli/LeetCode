package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterinaString {
    public static int firstUniqChar(String s) {

       /* Map<Character, Integer> map=new LinkedHashMap<>();
        int i=0;
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if(map.containsKey(c)){
                map.replace(c, -1);
            }else {
                map.put(c, i);

            }
            i++;

        }

        return map.values().stream()
                .filter(v -> v >= 0)
                .findFirst()
                .orElse(-1);*/

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
            System.out.println(c-'a');
        }


        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;



    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("dddccdbba"));
    }
}
