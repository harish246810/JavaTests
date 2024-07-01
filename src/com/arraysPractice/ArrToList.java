package com.arraysPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrToList {
    public static void main(String[] args) {
        String array1[] = { "a1", "a2", "a3" };
        String array2[] = { "b1", "b2", "b3" };
        String array3[] = { "c1", "c2", "c3" };

        // Print the Array using Arrays
        System.out.println("Array: " + Arrays.toString(array1));

        // convert the Array to List
        List<String> list = new ArrayList<>();
        for(String t : array1) {
            list.add(t);
        }
        System.out.println("List: " + list);

        // or using asList from Arrays
        List<String> list2 = Arrays.asList(array2);
        System.out.println("List2: " + list2);

        // or using addAll from Collection
        List<String> list3 = new ArrayList<>();
        Collections.addAll(list3, array3);
        System.out.println("List3: " + list3);
    }
}
