package com.strings;

public class StringLen {
    public static void main(String[] args) {


        String str1 = "Selenium Code Test";
        int count1=0;
        char[] strCharArray=str1.toCharArray();
        for(char c:strCharArray)
        {
            count1++;
        }
        System.out.println(count1);


        //or using StringIndexOutOfBoundsException -- not efficient
        String str2 = "Selenium Code Test";
        int i2=0;
        try{
            for(i2=0;;i2++)
            {
                str2.charAt(i2);
            }
        }
        catch(Exception e)
        { }
        System.out.println(i2);

        //or using substring as a method
        String str4 = "Selenium Code Test";
        System.out.println(strLen(str4));

        // or
        String str = "Selenium Code Test", strArr[];
        int count = 0;
        strArr = str.split("");
        for(String s: strArr) {
            count++;
        }
        System.out.println(count);

    }

    static int strLen(String str4) {
        return str4.isEmpty() ? 0 : 1 + strLen(str4.substring(1));

    }
}
