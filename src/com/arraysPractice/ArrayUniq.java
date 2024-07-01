package com.arraysPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayUniq {
    public static void main(String[] args) {
        int[] arr = {8, 4, 3, 4, 6, 3, 4, 1};

        /*
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                continue;
            } else{
                al.add(arr[i]);
            }
        }
        System.out.println(al);
         */


        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i :arr){
            hs.add(i);
        }
        System.out.println(hs);


    }
}
