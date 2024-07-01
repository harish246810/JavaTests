package com.collectionsPrac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ALtoStrArr {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("one");  al.add("three");  al.add("two");

        String[] strArr = al.toArray(new String[al.size()]);

        for(String str: strArr){
            System.out.println(str);    // one  three   two
        }

    }
}
