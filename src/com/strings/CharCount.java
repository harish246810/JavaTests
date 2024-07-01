package com.strings;

import java.util.*;

public class CharCount {
    public static void main(String[] args) {
        String inputStr = "Istam vach indi raasuko".toLowerCase();
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i =0; i<inputStr.length(); i++){
            int counter = 0;
            if(hm.containsKey(inputStr.charAt(i))) {
                hm.put(inputStr.charAt(i), hm.get(inputStr.charAt(i)) + 1);
            }else{
                hm.put(inputStr.charAt(i),1);
            }
        }
        System.out.println(hm);

        //To find most repeated character
        Character maxRepChar = Collections.max(hm.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("max occurred key and value is "+maxRepChar+" "+hm.get(maxRepChar));

        // if we need to apply any condition, we can use cursors
        //To get all chars that have repeated more than once with their count.
        Iterator itr = hm.keySet().iterator();
        while(itr.hasNext()){
            Character temp = (Character) itr.next();
            if(hm.get(temp)>1){
                System.out.println(temp+" "+hm.get(temp));
            }
        }
    }
}
