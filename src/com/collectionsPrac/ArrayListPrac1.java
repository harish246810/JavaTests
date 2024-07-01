package com.collectionsPrac;

import java.util.*;

public class ArrayListPrac1 {
    public static void main(String[] args) {
        // constructing an array list
        ArrayList<Integer> al = new ArrayList<Integer>();
        // ArrayList<String> al = new ArrayList<String>(20);
        // ArrayList<Integer> al = new ArrayList<Integer>(al2);     // creates an empty list of size al2
        // ArrayList al2 = new ArrayList();       // will store objects

        al.add(5);  al.add(10); al.add(15);     // add elem
        System.out.println(al);         // [5, 10, 15]

        al.add(3,20);   //index(high index-indexoutofboundexception), elem
        System.out.println(al);         // [5, 10, 15, 20]

        System.out.println(al.get(2));        // Object get(int index)  - to fetch any value -- 15

        System.out.println(al.set(1,30));   // change existing elem - Object set(int index,Object o)  -- 10(old elem)
        System.out.println(al);         // [5, 30, 15, 20]

        al.remove(2);           // remove any elem by index - returns boolean
        System.out.println(al);         // [5, 30, 20]

        System.out.println(al.size());      // gets size of al -- 3

        ArrayList<Integer> al2 =(ArrayList<Integer>) al.clone();    //create a copy of an array
        System.out.println(al2);    // [5, 30, 20]

        al2.addAll(2, al);      //boolean addAll (int index(optional), collection c)  -- Clone
        System.out.println(al2);    // [5, 30, 5, 30, 20, 20]

        Collections.sort(al);                   // sort al
        System.out.println(al);     //[5, 20, 30]

        System.out.println(Arrays.toString(al.toArray()));       // to change al to array   --[5, 20, 30]

        al2.clear();        // clear a list
        System.out.println(al2);        // []

        System.out.println(al.contains(20));        // contains - returns boolean   --true

        al.ensureCapacity(20);          // to increase the default capacity -- default 10 , now 20
        al.trimToSize();        // default reduces to the current size

        System.out.println(al.isEmpty());        // checks if it has elem - returns boolean   --false

        System.out.println(al.indexOf(30));        // int indexOf(Object o) - first occurance  -- 2
        al.add(30); al.add(30);
        System.out.println(al.lastIndexOf(30));        // last occurance-- 4

        al.forEach(System.out::println);        // to print al using foreach

        // ------- LOOP -------
        // al = [5, 20, 30]

        //1. for loop
        for(int i=0; i<al.size(); i++){             // loop //int size() --3
            System.out.println(al.get(i));      // 5    20   30
        }

        //2. for each loop
        for(int i:al){
            System.out.println(i);      // 5    20   30
        }

        //3. Iterator
        Iterator<Integer> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());      // 5    20   30
        }

        //4. J8 - lambda + for each
        al.forEach(i->{
            System.out.println(i);      // 5    20   30
        });

        //5. J8 - lambda + for each remaining(iterator method)
        al.iterator().forEachRemaining(i->{
            System.out.println(i);      // 5    20   30
        });
    }
}
