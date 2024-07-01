package com.Numbers;

public class ReverseNo {
    public static void main(String[] args) {
        int num = 123456789;
        int revNo = 0;

        while(num>0){
            revNo = (revNo*10)+num%10;
            num/=10;
        }
        System.out.println(revNo);
    }
}
