package com.Numbers;

import java.util.Scanner;

public class EvenOddCalc {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n =s.nextInt();

        while(n!=1) {
            if(n % 2 != 0) {    //odd
                n = n*3 + 1;
            } else {            // even
                n = n/2;
            }
            System.out.print(n+" ");
        }
    }
}
