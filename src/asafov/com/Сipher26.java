package asafov.com;

public class Сipher26 {

    String cipher26(String message)  {
        String result = "";
        char [] charr = message.toCharArray();
        int sub=0,prev=0;
        for(int i=0;i<message.length();i++)
        {
            int t = (charr[i]-97);
            sub = t -prev;
            if(sub<0)
                sub=sub+26;
            result+=(char)(sub+97);
            prev = t;
        }
        return result;
    }


}
