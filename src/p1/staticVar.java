package p1;

public class staticVar {
    int temp = staticVar2;   //order of init for static var doesnt matter
    // int temp2 = classVar;   //Throws error - Illegal forward ref

    static int staticInt = 5;
    int classVar;

    {
        System.out.println("Inside no name method present at the beginning");
    }

    static {
        System.out.println("Inside Static method present at the beginning");
    }

    //Main method
    public static void main(String[] args){
        staticVar p1 = new staticVar();
        p1.staticInt = 10;
        System.out.println(p1.staticInt);
        System.out.println(staticInt);

        //System.out.println(staticVar3);   //Throws error


    }
    static int staticVar2 = 20;

    static {
        int staticInt,staticVar3 = 30;
        System.out.println("Inside Static method1 present at the end");
    }

    static {
        System.out.println("Inside Static method2 present at the end");
    }

    {
        System.out.println("Inside no name method present at the end");
    }

}

