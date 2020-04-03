package asafov.com;

import java.util.Arrays;

public class SwitchLights {

    static int[] switchLights(int[] a) {
        int l=a.length;
        for (int i=a.length-1;i>=0;i--){
            if (a[i]==0){
                l--;
            }
            //switch
            int sw = l-i;
            if (sw%2!=0){
                if (a[i]==0){
                    a[i]=1;
                }else{
                    a[i]=0;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr ={1, 1, 1, 0, 1, 1, 1};
        arr = switchLights(arr);
        System.out.println(Arrays.toString(arr));
    }
}
