package asafov.com;

public class CheckPalindrome {

    static boolean checkPalindrome(String inputString) {
        if (inputString==null || inputString.length()==0) return false;
        int i=0,j=inputString.length()-1;
        while (i<=j){
            if (inputString.charAt(i) != inputString.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {

    }
}
