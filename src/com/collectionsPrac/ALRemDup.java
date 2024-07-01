package com.collectionsPrac;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ALRemDup {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("one");  al.add("three");  al.add("one");  al.add("three");  al.add("two");
        al.forEach(System.out::println);

        // 1. w/o insertion order
        ArrayList<String> al2 = new ArrayList<>(new HashSet<String>(al));
        al2.forEach(System.out::println);

        // 2. w/ insertion order
        ArrayList<String> al3 = new ArrayList<>(new LinkedHashSet<String>(al));
        al3.forEach(System.out::println);

    }
}
