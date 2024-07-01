package com.arraysPractice;

public class AddZeroAtLast {

    public static void main(String[] args) {
        // To print zeros at last
        int arr[] = {0,4,0,1,0,0,5,8,0,2,0,5,7,9};
        int reqArr[] = new int[arr.length];
        int count=0, c=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                reqArr[c] = arr[i];
                c++;
            }
            else {
                count = count+1;
            }
        }
        while(count > 0) {
            reqArr[c] = 0;
            c++;
            count--;
        }

        for(int x: reqArr) {
            System.out.print(x+" ");
        }
    }
}
