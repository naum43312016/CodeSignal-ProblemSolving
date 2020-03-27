package asafov.com;

import java.util.Arrays;

public class IsMAC48Address {

    static boolean isMAC48Address(String inputString) {
        if (inputString.charAt(inputString.length()-1) == '-') return false;
        String[] address =inputString.split("-");
        if (address.length!=6) return false;
        for (String str : address){
            if (str.length()!=2) return false;
            int c1 = str.charAt(0);
            int c2 = str.charAt(1);
            if ((c1<48 ||(c1>57 && c1<65) || c1 >70)){
                return false;
            }
            if ((c2<48 ||(c2>57 && c2<65) || c2 >70)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isMAC48Address("00-1H-63-84-45-E6"));
    }
}
