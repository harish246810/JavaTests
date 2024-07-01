package com.strings;

import java.util.HashMap;

public class FirstNonRepChar {

    public static void main(String[] args) {
        String str = "aaabbbbccccdedddffrrrwwwwg";

        HashMap<Character, Integer> retMap = notRepeatable(str);
        for(int i=0; i<str.length(); i++) {
            if(retMap.get(str.charAt(i)) == 1) {
                System.out.println(str.charAt(i));      // -- e
                break;
            }
        }
    }
    public static HashMap<Character, Integer> notRepeatable(String str) {

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(int i=0; i<str.length(); i++) {
            if(hm.isEmpty()) {
                hm.put(str.charAt(i), 1);
            }
            else {
                char ch = str.charAt(i);
                if(hm.containsKey(ch)) {
                    hm.put(ch, hm.get(ch)+1);
                }
                else {
                    hm.put(ch, 1);
                }
            }
        }
        return hm;
    }
}
