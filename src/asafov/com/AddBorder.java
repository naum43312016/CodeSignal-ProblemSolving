package asafov.com;

import java.util.Arrays;

public class AddBorder {

    String[] addBorder(String[] picture) {
        int h = picture.length;
        int len = picture[0].length();
        String[] res = new String[h+2];
        String star = "";
        int i = 0;
        len = len+2;
        while (i<len){
            star+="*";
            i++;
        }
        res[0]=star;
        res[res.length-1]=star;
        i = 0;
        while (i<picture.length){
            String str = picture[i];
            str = "*" + str + "*";
            res[i+1] = str;
            i++;
        }
        return res;
    }

}
