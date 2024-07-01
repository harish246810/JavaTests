package com.arraysPractice;

import java.util.Arrays;

public class AddElemArray {
    public static void main(String[] args) {
        // Insert elem into an array at a specified index
        int[] arr = {1,2,3,4,5,6};
        int index = 3;
        int[] OutputArr = new int[arr.length+1];

        for(int i=0,j=0; i<OutputArr.length; i++) {
            if(i==index) {
                OutputArr[i] = 7;
            }else {
                OutputArr[i] = arr[j];
                j++;
            }
        }
        OutputArr[index] = 7;

        System.out.println(Arrays.toString(OutputArr));  //[1, 2, 3, 7, 4, 5, 6]
    }
}
