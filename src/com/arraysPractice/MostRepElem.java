package com.arraysPractice;

public class MostRepElem {
    public static void main(String[] args) {
        int[] arr = {1,3,6,8,4,2,1,4,6,8,1,4,7,1};
        int elem = 0, counter = 0;
        for(int i=0; i<arr.length; i++){
            int tempElem = arr[i], tempCounter = 0;

            for(int j=0; j<arr.length; j++){
                if(arr[j]==arr[i]){
                    tempCounter++;
                }
                if(tempCounter>counter){
                    counter = tempCounter;
                    elem = tempElem;
                }
            }
        }
        System.out.println(elem+" occurred " +counter); //1 occurred 4
    }
}
