package asafov.com;

public class Decipher {

    String decipher(String cipher) {
        String res="";
        String sum="";
        for (int i=0;i<cipher.length();i++){
            sum+=cipher.charAt(i);
            int code = Integer.valueOf(sum);
            if (code>96){
                char ch = (char)code;
                res+=ch;
                sum="";
            }
        }
        return res;
    }


}
