package com.strings;

public class Swap2Str {
    public static void main(String[] args) {
        //Swap 2 str without using 3rd var.
        String str1 = "First";
        String str2 = "Second";
        str1 = str1 + str2;     //FirstSecond
        str2 = str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("String1 now is: "+str1);
        System.out.println("String1 now is: "+str2);
    }
}
