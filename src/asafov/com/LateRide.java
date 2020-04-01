package asafov.com;

public class LateRide {
    int lateRide(int n) {
        if (n==0) return 0;
        int h = n/60;
        int m = n%60;
        char[] hArr = String.valueOf(h).toCharArray();
        char[] mArr = String.valueOf(m).toCharArray();
        int sum = 0;
        for (char c: hArr){
            sum+=Character.getNumericValue(c);
        }
        for (char c: mArr){
            sum+=Character.getNumericValue(c);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(808%60);
    }
}
