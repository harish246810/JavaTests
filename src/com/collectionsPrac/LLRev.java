package com.collectionsPrac;

import java.util.Iterator;
import java.util.LinkedList;

public class LLRev {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();
        ll.add("Sura");     ll.add("Sai");     ll.add("Harish");

        LinkedList<String> revLl = new LinkedList<>();
        // descendingIterator()
        Iterator<String> itr = ll.descendingIterator();
        while(itr.hasNext()){
            revLl.add(itr.next());
        }

        revLl.forEach(System.out::println);
    }
}
