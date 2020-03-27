package asafov.com;

import java.util.Arrays;

public class IsIPv4Address {

    static boolean isIPv4Address(String inputString) {
        if (inputString==null) return false;
        String[] arr = inputString.split("\\.");
        if (arr.length!=4) return false;
        for (String str : arr){
            if (str.equals("")) return false;
            if (str.length()>1 && str.charAt(0)=='0') return false;
            try {
                Integer i = Integer.valueOf(str);
                if (i<0 || i>255) return false;
            }catch (NumberFormatException e){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIPv4Address("1.125.25.25h"));
    }
}
