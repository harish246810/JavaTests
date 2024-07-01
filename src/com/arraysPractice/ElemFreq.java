package com.arraysPractice;

import java.util.HashMap;
import java.util.Map;

public class ElemFreq {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 2 ,3 ,4, 1, 4, 2, 4, 5, 6, 5, 6, 1};
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i])+1);
            }else{
                hm.put(arr[i], 1);
            }
        }
        System.out.println(hm);
    }
}
