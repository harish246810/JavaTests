package p1;

interface A1{
    public default int getSpeed(){
        return 5;
    }
}

interface B1{
    public default int getSpeed(){
        return 15;
    }
}


interface C1{
    public static void main(String[] args){
        System.out.println("test");
    }
}