package asafov.com;


public class AreSimilar {

    static boolean areSimilar(int[] a, int[] b) {
        int ans=0;
        for (int i = 0;i<a.length;i++){
            if (ans>1) return false;
            if (a[i]!=b[i]){
                ans++;
                int j = i;
                j = index(a,b,i,j);
                if (j>=a.length) return false;
                    int t = b[i];
                    b[i] = b[j];
                    b[j] = t;
            }
        }
        return ans<2;
    }

    private static int index(int[]a,int[]b,int i,int j){
        while (j<b.length && a[i]!=b[j]){
            j++;
        }
        if (j>=a.length) return a.length;
        if (a[j]==b[i]){
            return j;
        }else {
            return index(a,b,i,j+1);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,2};
        int[] b = {2,1,1};
        System.out.println(areSimilar(a,b));
    }
}
