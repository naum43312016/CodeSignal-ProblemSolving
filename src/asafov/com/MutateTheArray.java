package asafov.com;

public class MutateTheArray {

    int[] mutateTheArray(int n, int[] a) {
        int[] b = new int[n];
        for (int i=0;i<n;i++){
            if (i==0){
                int res = a[i];
                if (i+1!=n){
                    res+=a[i+1];
                }
                b[i]=res;
            }else if (i==n-1){
                int res = a[i]+a[i-1];
                b[i]=res;
            }else {
                b[i]=a[i]+a[i-1]+a[i+1];
            }
        }
        return b;
    }

}
