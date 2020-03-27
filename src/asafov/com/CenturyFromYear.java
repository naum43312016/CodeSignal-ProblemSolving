package asafov.com;

import java.util.Arrays;

public class CenturyFromYear {

    static int centuryFromYear(int year) {
        if(year<101) return 1;
        char[] y = String.valueOf(year).toCharArray();
        if (y.length==3){
            int ans = Character.getNumericValue(y[0]);
            if (Character.getNumericValue(y[1])>0 || Character.getNumericValue(y[2])>0){
                ans++;
                return ans;
            }
            return ans;
        }else {
            if (Character.getNumericValue(y[0])==1){
                int ans = 10;
                ans+=Character.getNumericValue(y[1]);
                if (Character.getNumericValue(y[2])>0 || Character.getNumericValue(y[3])>0){
                    ans++;
                    return ans;
                }
                return ans;

            }else{
                int ans = 20;
                if (Character.getNumericValue(y[2])>0 || Character.getNumericValue(y[3])>0){
                    ans++;
                    return ans;
                }
                return ans;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(centuryFromYear(2001));
    }
}
