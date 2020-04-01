package asafov.com;

public class CountTinyPairs {

    int countTinyPairs(int[] a, int[] b, int k) {
        int ans = 0;
        int i=0,j=a.length-1;
        while (i<a.length){
            String num = ""+a[i]+b[j];
            int n = Integer.valueOf(num);
            if (n<k) ans++;
            j--;
            i++;
        }
        return ans;
    }

}
