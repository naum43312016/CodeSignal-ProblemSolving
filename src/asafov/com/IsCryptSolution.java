package asafov.com;

import java.util.Arrays;

public class IsCryptSolution {

    static boolean isCryptSolution(String[] crypt, char[][] solution) {
        for (int i=0;i<crypt.length;i++){
            String str = "";
            for (char c : crypt[i].toCharArray()){
                char num = getNumber(c,solution);
                if (num=='_') return false;
                str+=num;
            }
            crypt[i]=str;
        }

        String num1=crypt[0];
        String num2=crypt[1];
        String res=crypt[2];
        if ((num1.length()>1 && num1.charAt(0)=='0') || (num2.length()>1 && num2.charAt(0)=='0') || (res.length()>1 && res.charAt(0)=='0')) return false;
        long n1=Long.valueOf(num1);
        long n2=Long.valueOf(num2);
        long nRes=Long.valueOf(res);
        if (n1+n2==nRes) return true;
        return false;
    }

    static private char getNumber(char c, char[][] solution) {
        for (char[] arr : solution){
            if (arr[0] == c){
                return arr[1];
            }
        }
        return '_';
    }

    public static void main(String[] args) {
        String[] arr = {"AAAAAAAAAAAAAA",
                "BBBBBBBBBBBBBB",
                "CCCCCCCCCCCCCC"};
        char[][] sol = {
                {'A','1'},
                {'B','2'},
                {'C','3'}
        };

        System.out.println(isCryptSolution(arr,sol));
    }
}
