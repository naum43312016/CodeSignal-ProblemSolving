package asafov.com;

public class IsLucky {

    boolean isLucky(int n) {
        String s = String.valueOf(n);
        int len = s.length();
        int sum1 = 0,sum2=0;
        char[] arr = s.toCharArray();
        int i = 0;
        int j = len/2;
        while (i<j){
            sum1+= Character.getNumericValue(arr[i]);
            i++;
        }
        while (j<len){
            sum2+= Character.getNumericValue(arr[j]);
            j++;
        }
        return sum1==sum2;
    }

}
