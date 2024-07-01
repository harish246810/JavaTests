package p1;

public class strBuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("1Z0");
        sb.append("-808");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        StringBuilder sb1 = new StringBuilder("1Z0");
        StringBuilder sb2 = new StringBuilder("1Z0");
        String sb3 = new String("1Z0");

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);

        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.toString()==sb2.toString());
        // System.out.println(sb3==sb2);    - String and SB cannot be compared
        System.out.println(sb3.equals(sb2));

    }
}
