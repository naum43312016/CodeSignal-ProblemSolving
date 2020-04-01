package asafov.com;

import java.util.HashMap;
import java.util.Map;

public class CreateAnagram {

    int createAnagram(String s, String t) {
        if (s.length()==0) return t.length();
        Map<Character,Integer> map = new HashMap<>();
        for (char c:t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int ans =0;
        int len=t.length();
        for (char c:s.toCharArray()){
            if (map.containsKey(c)){
                if (map.get(c)>0){
                    map.put(c,map.get(c)-1);
                    ans++;
                }
            }
        }
        return len-ans;
    }


}
