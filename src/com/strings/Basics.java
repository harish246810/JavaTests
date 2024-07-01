package com.strings;

import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
        String str = "Harish";      //This will be gc'd
        System.out.println(str.hashCode());     // -2140586139
        str = str.concat(" Sura");
        str+= " sai";
        System.out.println(str.hashCode());     // -2059441721
        System.out.println(str);            // Harish Sura sai

        StringBuffer sb = new StringBuffer("Harish");
        System.out.println(sb.hashCode());          // 1554874502
        sb.append("THis is sb");
        System.out.println(sb.hashCode());          // 1554874502

        //convert char array to String
        char[] ch = {'a', 'e', 'i', 'o', 'u'};
        String strChr = new String(ch);
        String strChr2 = String.valueOf(ch);

        System.out.println(("  "+ strChr + strChr2+ "  ").trim());      // aeiouaeiou
        System.out.println(strChr.substring(3,5));      // ou

        String[] strSplitArr = strChr.split("i");
        System.out.println(Arrays.toString(strSplitArr));   // [ae, ou]

        //STRINGBUILDER
        StringBuilder sb2 = new StringBuilder("string builder");
        System.out.println(sb2.reverse());      //redliub gnirts
    }
}
