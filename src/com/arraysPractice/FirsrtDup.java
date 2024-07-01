package com.arraysPractice;

import java.util.Arrays;

public class FirsrtDup {
    public static void main(String[] args) {
        int arr[] = new int[]{22, 23, -24, 24, 26, 27, 220, 26};
        Arrays.sort(arr);       //sorting asc
        for(int i=0; i<arr.length; i++){
            if(i<arr.length-1) {
                if (arr[i] == arr[i + 1]) {
                    System.out.println(arr[i]);
                    break;
                }
            }else
                System.out.println("No dup");
        }
    }
}