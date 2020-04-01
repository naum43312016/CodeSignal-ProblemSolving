package asafov.com;

import java.util.ArrayList;
import java.util.List;

public class MessageFromBinaryCode {
    static String messageFromBinaryCode(String code) {
        StringBuilder str = new StringBuilder();
        List<String> list = new ArrayList<>();
        int len = code.length();
        int start = 0;
        int end = 8;
        while (end<=len){
            list.add(code.substring(start,end));
            start+=8;
            end+=8;
        }
        for (String s : list){
            char c = (char)Integer.parseInt(s, 2);
            str.append(c);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(messageFromBinaryCode("010010000110010101101100011011000110111100100001"));
    }

}
