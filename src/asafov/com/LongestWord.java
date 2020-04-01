package asafov.com;

import java.util.Arrays;

public class LongestWord {
    String longestWord(String text) {
        var s = text.split("[^a-zA-Z]");
        String t = "";
        for(int i = 0; i < s.length;i++){
            if(s[i].length() > t.length() )
                t = s[i];
        }
        return t;
    }
}
