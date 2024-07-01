package com.arraysPractice;

public class AltArrange {
    public static void main(String[] args){
        int arr[] = new int[]{1, 2, 3, 4, 5, 6};   //need to print{6,1,5,2,4,3}
        int small = 0, large = arr.length-1;
        int outputArr[] = new int[arr.length];
        boolean flag1=true;
        for(int i=0;i<arr.length;i++){
            if(flag1)
                outputArr[i] = arr[large--];
            else
                outputArr[i] = arr[small++];
                flag1 = !flag1;
        }
        for(int j:outputArr){
            System.out.print(j+" ");
        }
    }
}
