package asafov.com;

import java.util.Arrays;

public class ArrayConversion {

    static int arrayConversion(int[] inputArray) {
        int iter=1;
        while (inputArray.length>1){
            int j=0;
            int[] arr = new int[inputArray.length/2];
            for (int i=0;i<inputArray.length-1;i++){
                if (iter%2!=0) {
                    arr[j] = inputArray[i] + inputArray[i + 1];
                }else {
                    arr[j] = inputArray[i] * inputArray[i + 1];
                }
                j++;
                i++;
            }
            inputArray=arr;
            iter++;
        }
        return inputArray[0];
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(arrayConversion(a));
    }

}
