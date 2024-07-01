package com.strings;

public class MostRepChar {
    public static void main(String[] args) {
        // To find most repeated character in a string
        String str = "Harish gadu idi chesestadui i i";
        int counter = 0;
        char outputChar = ' ';
        for(int i=0; i<str.length();i++){
            int tempCounter = 0;
            for(int j=0; j<str.length();j++){
                if(str.charAt(j) == str.charAt(i)){
                    tempCounter++;
                }
                if(tempCounter>counter){
                    counter = tempCounter;
                    outputChar = str.charAt(j);
                }
            }
        }
        System.out.println(outputChar+" repeated for "+counter);        // i repeated for 6
    }
}
