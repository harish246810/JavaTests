package com.Numbers;

public class PrimeNo {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            boolean flag=true;
            for(int j=2; j<=i/2;j++) {
                if (i % j == 0) {
                    flag=false;
                }
            }
            if(flag)
                System.out.print(i+" ");
        }
    }
}
