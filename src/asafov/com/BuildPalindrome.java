package asafov.com;

public class BuildPalindrome {

    String buildPalindrome(String st) {
        int i = 0;
        while(!st.equals(new StringBuffer(st).reverse().toString())){
            st = new StringBuilder(st).insert(st.length()-i,st.charAt(i)).toString();
            i++;
        }
        return st;
    }
}
