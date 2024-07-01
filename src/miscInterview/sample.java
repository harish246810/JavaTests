package miscInterview;

public class sample {
    public static void main(String[] args) {
        int[] arr = {4,6 ,8 , 9, 10, 23, 45, 67};
        int inp = 13;

    }



    public void testMatch(int[] inputarr, int outputVal){
        for(int i=0; i<=inputarr.length-1; i++) {
                if (inputarr[i] + inputarr[i] == outputVal) {
                    System.out.println(i);
                    break;
                }
            }
        }
}
