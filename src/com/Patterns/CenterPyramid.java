package com.Patterns;

public class CenterPyramid {
    public static void main(String[] args) {

        int n=6;
        // int num = 1;

        for (int i=0; i<n; i++)                 // Handle rows
        {
            for (int j=n-i; j>1; j--)
            {
                System.out.print(" ");          // printing spaces
            }
            for (int k=0; k<=i; k++)
            {
                System.out.print("* ");         // printing stars
                // System.out.print(num++ + " ");         // printing numbers
            }
            System.out.println();
        }
    }
}
