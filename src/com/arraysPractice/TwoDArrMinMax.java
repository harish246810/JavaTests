package com.arraysPractice;

public class TwoDArrMinMax {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}};
        int min=arr[0][0], max=arr[0][0];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(min+" "+max); // 1 6
    }
}
