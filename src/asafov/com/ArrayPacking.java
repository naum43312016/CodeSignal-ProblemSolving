package asafov.com;

import java.util.Arrays;

public class ArrayPacking {

    static int arrayPacking(int[] a) {
        String[] arr = new String[a.length];
        for (int i=0;i<a.length;i++){
            arr[i] = Integer.toBinaryString(a[i]);
            arr[i]=String.format("%8s", arr[i]).replace(' ', '0');
        }
        String b = "";
        for (int i=arr.length-1;i>=0;i--){
            b+=arr[i];
        }

        return  Integer.parseInt(b, 2);
    }

//[00011000, 01010101, 00000000]
    public static void main(String[] args) {
        int[] a = {24, 85, 0};
        int n = arrayPacking(a);
        System.out.println(n);
    }
}
