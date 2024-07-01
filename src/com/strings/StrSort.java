package com.strings;
import java.util.Arrays;
import java.util.Collections;

public class StrSort {
    public static void main(String[] args) {
        String wordStr = "Sorting this string";
        System.out.println(withoutMethod(wordStr)); // Sgghiiinnorrssttt
        System.out.println(withMethod(wordStr));    // Sgghiiinnorrssttt
    }

    public static String withMethod(String inputStr1){
        char[] chars = inputStr1.toCharArray();
        Arrays.sort(chars);
        String sortedStr = String.valueOf(chars);      //or    String sorted = new String(chars);
        return sortedStr;
    }

    public static String withoutMethod(String inputStr){
        char[] wordArr = inputStr.toCharArray();
        for(int i=0; i<(wordArr.length-1); i++){
            for(int j=i+1; j>0; j--){
                if(wordArr[j] < wordArr[j-1]){          //character comparison
                    char temp = wordArr[j];             //Assign temp to 1st part of 2nd part..both are same
                    wordArr[j] = wordArr[j-1];
                    wordArr[j-1] = temp;
                }
            }
        }
        inputStr=String.valueOf(wordArr);
        return inputStr;
    }
}