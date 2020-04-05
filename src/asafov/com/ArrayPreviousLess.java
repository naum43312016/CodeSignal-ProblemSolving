package asafov.com;

public class ArrayPreviousLess {

    int[] arrayPreviousLess(int[] items) {
        int[] res = new int[items.length];
        res[0]=-1;
        int i=1;
        while (i<items.length){
            int num = items[i];
            int j=i-1;
            while (j>=0 && items[j]>=num){
                j--;
            }
            if (j<0){
                res[i]=-1;
            }else{
                res[i]=items[j];
            }
            i++;
        }
        return res;
    }


}
