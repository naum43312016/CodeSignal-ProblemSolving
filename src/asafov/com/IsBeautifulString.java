package asafov.com;

import java.util.HashMap;
import java.util.Map;

public class IsBeautifulString {
    static boolean isBeautifulString(String inputString) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : inputString.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            char let = entry.getKey();
            int freq = entry.getValue();
            if (let!='a'){
                char prev = (char)(((int)let)-1);
                if (!map.containsKey(prev)){
                    return false;
                }else {
                    int count = map.get(prev);
                    if (count<freq) return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isBeautifulString("aabbb"));
    }
}
