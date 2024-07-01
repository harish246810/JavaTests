package com.strings;

import java.util.HashMap;

public class StrCount {
    public static void main(String[] args) {
        // Each word count
        String str = "This this is is done for str str str count";
        String[] splitArr = str.split(" ");
        HashMap<String,Integer> hm = new HashMap<String,Integer>();

        for (int i=0; i<splitArr.length-1; i++) {
            if (hm.containsKey(splitArr[i])) {
                int count = hm.get(splitArr[i]);
                hm.put(splitArr[i], count+1);
            }
            else {
                hm.put(splitArr[i], 1);
            }
        }
        System.out.println(hm); //{str=3, this=1, for=1, This=1, is=2, done=1}
    }
}
