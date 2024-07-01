package com.arraysPractice;

public class NumCloseToO {
    public static void main(String[] args) {
        int[] inpArr = {6, 2, -10, -8, 5};
        int elem = inpArr[0];

        for(int i =0; i<inpArr.length; i++){
            if(Math.abs(inpArr[i])<elem){
                elem = inpArr[i];
            }
        }
        System.out.println(elem);
    }

}
