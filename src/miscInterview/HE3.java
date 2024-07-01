package miscInterview;

import java.util.HashSet;
import java.util.Scanner;

public class HE3 {
    public static void main(String[] args) {
        String strInput = "2 3 4 5 2 3 4 5 2 1 2";
        String[] inputArr = strInput.split(" ");

        HashSet<String> hs = new HashSet<String>();

        for(int i = 0; i < inputArr.length; i++)
        {
            // add all the elements to the HashSet
            hs.add(inputArr[i]);
        }
        System.out.println(hs.size());
    }
}
