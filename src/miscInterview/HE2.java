package miscInterview;

public class HE2 {
    public static void main(String[] args) {
        String strInput = "2 3 4 5 2 1 2";



        String[] inputArr = strInput.split(" ");

        /*
        int[] intArr = new int[]{inputArr.length};

        //int inum = Integer.parseInt(str);
        for(int i=0; i<inputArr.length; i++){
            intArr[i] = Integer.parseInt(inputArr[i]);
        }

        //Arrays.sort(intArr);

        */

        int res = 1;
        for (int i = 0; i < inputArr.length; i++)
        {
            int j = 0;
            for (j = 0; j < i; j++)
                if (inputArr[i] == inputArr[j])
                    break;
            if (i == j)
                res++;
        }
        System.out.println(res);

    }
}
