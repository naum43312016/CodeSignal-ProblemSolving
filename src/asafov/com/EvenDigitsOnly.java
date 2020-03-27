package asafov.com;

public class EvenDigitsOnly {

    boolean evenDigitsOnly(int n) {
        String s = String.valueOf(n);
        for (int i=0;i<s.length();i++){
            int num = Character.getNumericValue(s.charAt(i));
            if (num%2!=0) return false;
        }
        return true;
    }
}