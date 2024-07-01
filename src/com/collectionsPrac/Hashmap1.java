package com.collectionsPrac;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap1 {
    public static void main(String[] args){
        Map<String, Integer> hm = new HashMap<>();
        hm.put("java", 1);  hm.put("Pyt", 2);   hm.put("C", 3);  hm.put("Cpp", 4);

        hm.put("C",24);   //duplicate - replaces

        hm.putIfAbsent("Go", 5);    // if not present- adds
        hm.putIfAbsent("Pyt", 5);   // if present - ignores
        System.out.println(hm);     // --{Cpp=4, java=1, C=24, Go=5, Pyt=2}

        //key-based removal
        hm.put("dummy", 100);
        hm.remove("dummy");
        //value-based removal
        hm.put("dummy", 100);
        hm.remove(101);
        //key-value pair based removal
        hm.put("dummy", 100);
        System.out.println(hm.remove("dummy", 100));     // remove returns boolean  -- true


        //To make it synchronized
        Map syncHm = Collections.synchronizedMap(hm);

        if (!hm.isEmpty()) {        // boolean isEmpty
            System.out.println("not empty"); }

        System.out.println(hm.size());   // int size() -- 5

        HashMap<String, Integer> hm2=new HashMap<>();
        hm2.put("new", 10);
        hm2.putAll(hm);             // copies entire map --
        System.out.println(hm2);        // {new=10, Cpp=4, java=1, C=24, Go=5, Pyt=2}

        hm2.replace("Go", 5, 50);    // boolean replace - (k,oldV, newV)
        hm2.replaceAll((k,v) -> 50);     // replaces all the values to 50
        System.out.println(hm2);        // -- {new=50, Cpp=50, java=50, C=50, Go=50, Pyt=50}


        // only keys
        for (String key : hm.keySet()) {
            System.out.println(key);        // prints keys  -- Cpp java C Go  Pyt
            System.out.println(hm.get(key));    // get() - returns values/null    -- 4 1 24 5 2
        }

        // only values
        for (Integer val : hm.values()) {
            System.out.println(val);    // 4 1 24 5 2
        }

        // Both keys & values -- entrySet
        // Each entry has getKey() & getValue()
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " "+ entry.getValue());     // -- Cpp 4 java 1  C 24 ...
        }

        // using iterator - entrySet
        Iterator itr = hm.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry pair = (Map.Entry)itr.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());    // Cpp = 4  java = 1   C = 24  Go = 5  Pyt = 2
        }

        /*
               HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i])+1);
            }else{
                hm.put(arr[i], 1);
            }
        }
        System.out.println(hm.size());
        System.out.println(hm.get(2).getClass().getName());

        System.out.println(hm);

        //entrySet(), keySet(), values()
        System.out.println(hm.entrySet());  // [1=2, 2=3, 3=2, 4=3]
        System.out.println(hm.keySet());    // [1, 2, 3, 4]
        System.out.println(hm.values());    // [2, 3, 2, 3]

        // get(), getOrDefault()
        System.out.println(hm.get(1));
        System.out.println(hm.getOrDefault(5, 100));

        // remove(k) - returns value, remove(k,v) - returns boolean
        System.out.println(hm.remove(1));
        System.out.println(hm.remove(2, 3));

        // Entries
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()) {
            System.out.print(entry+" ");
        }
         */
    }
}
