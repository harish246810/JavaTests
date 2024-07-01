package com.arraysPractice;

public class ArrayRotations {
    public static void main(String[] args){
        int arr[] = new int[]{22,23,24,25,26,27,28};
        int rotCount = 2;       // Array values to be rotated to 2 places
        int[] outArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            System.out.print(leftRotation(arr,outArr,rotCount)[i]+" ");
        }
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(rightRotation(arr,outArr,rotCount)[i]+" ");
        }
    }

    public static int[] leftRotation(int[] inputArr, int[] outArr, int count){
        for(int i=0; i<inputArr.length; i++){
            outArr[i] = inputArr[(i+count)%inputArr.length];
        }
        return outArr;
    }

    public static int[] rightRotation(int[] inputArr, int[] outArr, int count){
        for(int j=0; j<inputArr.length; j++){
            outArr[j] = inputArr[(j+inputArr.length-count)%inputArr.length];
        }
        return outArr;
    }
}
