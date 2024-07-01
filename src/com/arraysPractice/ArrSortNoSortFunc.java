package com.arraysPractice;

public class ArrSortNoSortFunc {
    public static void main(String[] args) {
        int[] arr = new int[] { 7,1,2,3,4,6,5 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for(int j:arr){
            System.out.print(j+" ");    // 1 2 3 4 5 6 7
        }
        // To print 3rd highest number in the array
        System.out.println(" Third highest number in the array: "+arr[arr.length-3]);
    }
}
