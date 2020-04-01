package asafov.com;

import java.util.Arrays;

public class QuickSort {

    static public void sort(int[] arr,int l,int h){
        if (l<h) {
            int pi = part(arr, l, h);
            sort(arr, l, pi - 1);
            sort(arr, pi + 1, h);
        }
    }

    static private int part(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l;
        for (int j=l;j<h;j++){
            if (arr[j]<=pivot){
                swap(arr,j,i);
                i++;
            }
        }
        swap(arr,h,i);
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {9,-3,5,2,6,8,-6,1,3};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static private void swap(int[] arr, int i, int j) {
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}
