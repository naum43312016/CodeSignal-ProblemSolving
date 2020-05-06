package asafov.com.alg;

import java.util.Arrays;
import java.util.Random;

public class QuickSortAlg {


    public void quickSort(int[] arr,int l,int h){
        if (l<h){
            int p=part(arr,l,h);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,h);
        }
    }

    private int part(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i=l-1;
        for (int j=l;j<h;j++){
            if (arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return i+1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }



    public static void main(String[] args) {
        Random random = new Random();
        int[] a = random.ints(1000000, 10,10000000).toArray();
        new QuickSortAlg().quickSort(a,0,a.length-1);
    }
}
