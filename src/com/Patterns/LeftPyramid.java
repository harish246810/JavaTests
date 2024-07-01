package com.Patterns;

public class LeftPyramid {
    public static void main(String[] args) {
        int n = 6;
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {         // printing stars
               // System.out.print("* ");
                System.out.print(num++ + " ");         // printing numberss
            }
            System.out.println();
        }
    }
}
