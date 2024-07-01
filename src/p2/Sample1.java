package p2;
import java.util.*;

public class Sample1 {
    public static void main(String[] args){

        StringBuilder sb = new StringBuilder();
        sb.append(true);        // boolean
        sb.append('C');         // char

        char[] cArr = new char[]{'A','r','r','a','y','1'};
        sb.append(cArr);        // char array
        sb.append(cArr,0,3);    // append(char[] str, int offset, int len)

        CharSequence cSeq = "Csequence";
        sb.append(cSeq);
        //append(CharSequence s, int start, int end)
        sb.append(cSeq,3,6);

        sb.append(30.21d);  //double, float, long, int

        Object obVal = "Obj";
        sb.append(obVal);

        sb.append("Str");
        sb.append(new StringBuffer("Sb2"));

        System.out.println(sb);
    }
}
