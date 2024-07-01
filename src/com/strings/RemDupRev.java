package com.strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemDupRev {
    public static void main(String[] args) {
        // To remove duplicate char from the string & reverse each word
        String str = "Yeeesssss Sssseeelleeennniiiummmm";
        System.out.println(removeDuplicate(str));
    }
    public static String removeDuplicate(String str) {
        String outputStr = "";
        String strArr[] = str.split(" ");   // splitting for words

        for(String s: strArr) {
            LinkedHashSet<String> lhs = new LinkedHashSet<>();

            for(String s1 : s.split("")) {
                lhs.add(s1.toLowerCase());   // Adding each unique letter to set
            }

            String combString= "";  // adding each elem from set -> string
            for(String s2 :lhs) {
                combString += s2;
            }

            String revStr = "";     // reversing the string
            for(int i=combString.length()-1; i>=0; i--) {
                revStr = revStr+combString.charAt(i);
            }
            outputStr = outputStr + revStr +" ";    // to handle each word
        }
        return outputStr;
    }

}
