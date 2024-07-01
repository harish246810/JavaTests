package com.collectionsPrac;

import java.util.*;

public class HMsort {
    public static void main(String[] args){
        HashMap<Integer, String> hm=new HashMap<Integer, String>();
        hm.put(23, "Yash");
        hm.put(17, "Arun");
        hm.put(15, "Swarit");
        hm.put(9, "Neelesh");

        //using TreeMap constructor to sort the HashMap
        TreeMap<Integer,String> tm=new  TreeMap<Integer,String> (hm);
        Iterator itr=tm.keySet().iterator();
        while(itr.hasNext())
        {
            int key=(int)itr.next();
            System.out.println("Roll no:  "+key+"     name:   "+hm.get(key));
        }

        // Method 2 - Comparator Interface
        Map<Integer, String> map = sortValues(hm);
        System.out.println("After Sorting:");
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext())
        {
            Map.Entry me2 = (Map.Entry)iterator2.next();
            System.out.println("Roll no:  "+me2.getKey()+"     Name:   "+me2.getValue());
        }

    }

    //method to sort values for Method 2
    private static HashMap sortValues(HashMap map)
    {
        List list = new LinkedList(map.entrySet());
        //Custom Comparator
        Collections.sort(list, new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
                return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        //copying the sorted list in HashMap to preserve the iteration order
        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();)
        {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }
}