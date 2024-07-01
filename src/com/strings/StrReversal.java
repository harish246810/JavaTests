package com.strings;

public class StrReversal {
    public static void main(String[] args) {
        String str = "Harish is a good boy";
        System.out.println(revSB(str));     //yob doog a si hsiraH
        System.out.println(revWithToArray(str));    // hsiraH si a doog yob
        System.out.println(revWithoutArray(str));   //  yob doog a si hsiraH
    }

    public static String revSB(String strInput1){
        StringBuilder sb = new StringBuilder();
        sb.append(strInput1);       // String -> SB
        sb = sb.reverse();
        return sb.toString();       // StringBuilder -> String using .toString()
    }

    public static String revWithToArray(String strInput){
        String rev = "";
        for(String strSplit: strInput.split(" ")) {     // optional - to reverse each splitted word
            char[] ch = strSplit.toCharArray();     //Splitting str to array

            for (int i = strSplit.length() - 1; i >= 0; i--) {
                rev += ch[i];
            }
            rev=rev+" ";            //optional - to add space after each word
        }
        return rev;
    }

    public static String revWithoutArray(String strInput2){
        String rev = "";
        for(int j=strInput2.length()-1; j>=0; j--){
            rev+=strInput2.charAt(j);
        }
        return rev;
    }
}
