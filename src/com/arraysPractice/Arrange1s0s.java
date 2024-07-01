package com.arraysPractice;

import java.util.Arrays;

public class Arrange1s0s {
    public static void main(String[] args){

        int[] arr = {1,2,0,1,1,5,0,2,0,1};  //need to arrange 1s at beginning and 0s at end
        int counter1 = 0;
        int[] outputArr = new int[arr.length];
        Arrays.sort(arr);       // Arrays.sort(arr, Collections.reverseOrder());

        for(int i=0; i<arr.length; i++){
            counter1++;
            if(i<arr.length-1){
                if(arr[i]==0 & arr[i+1]==1){
                    break;
                }
            }
        }
        for(int j=0; j<arr.length; j++){
            outputArr[j] = arr[(j+counter1)%arr.length];
            System.out.println(outputArr[j]);
        }
    }
}
