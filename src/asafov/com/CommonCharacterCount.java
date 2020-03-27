package asafov.com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CommonCharacterCount {

    int commonCharacterCount(String s1, String s2) {
        Map<Character,Integer> map = new HashMap<>();
        int ans = 0;
        for (char c : s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (char c: s2.toCharArray()){
            if (map.containsKey(c)){
                int i = map.get(c);
                if (i>0){
                    ans++;
                    i--;
                    map.put(c,i);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
