package asafov.com;

import java.util.Arrays;

/*
Some people are standing in a row in a park.
There are trees between them which cannot be moved.
Your task is to rearrange the people by
their heights in a non-descending order without moving the trees.
People can be very tall!
 */
public class SortByHeight {

    static int[] sortByHeight(int[] a) {
        for (int i =1;i<a.length;i++){
            if (a[i]==-1) continue;
            int key = a[i];
            int j = i - 1;
            int k = 1;
            while (j>=0 && (a[j] > key || a[j]==-1)){
                if (a[j]==-1){
                    k++;
                }else{
                    a[j+k] = a[j];
                    k=1;
                }
                j--;
            }
            a[j+k] = key;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        int[] res = sortByHeight(a);
        System.out.println(Arrays.toString(res));
    }
}
