package asafov.com;

import java.util.HashMap;
import java.util.Map;

public class PalindromeRearranging {
    static boolean palindromeRearranging(String inputString) {
        Map<Character,Integer> map = new HashMap<>();
        for (char ch: inputString.toCharArray()){
            if (map.containsKey(ch)){
                int i = map.get(ch);
                i++;
                map.put(ch,i);
            }else {
                map.put(ch,1);
            }
        }
        boolean odd = false;

        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if (entry.getValue()%2!=0){
                if (odd) return false;
                odd=true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindromeRearranging("aabb"));
    }
}
