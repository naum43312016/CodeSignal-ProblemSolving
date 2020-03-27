package asafov.com;

public class AbsoluteValuesSumMinimization {

    int absoluteValuesSumMinimization(int[] a) {
        if (a.length < 3) return a[0];
        if (a.length%2==0){
            return a[a.length/2-1];
        }
        return a[a.length/2];
    }



    public static void main(String[] args) {

    }
}
