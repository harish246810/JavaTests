package p1;


public class practice2{
    public static void main(String args[]){
        practice2 p1 = new practice2();

        int x=10, y=20;
        int a2,b2 = 20;
        System.out.println(" test ");

        double d1 = 10.0/0.0;
        p1.main();

        if(x>10){
            System.out.println(">10");
        }else if(x>8){
            System.out.println(">8");
        }else if(x>5){
            System.out.println(">5");
        }else{
            System.out.println("in else");
        }
    }

    public void main(){
        System.out.println(" test another main");
    }

}