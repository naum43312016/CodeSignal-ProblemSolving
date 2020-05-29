package asafov.com;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class IncreasingDecreasingString {

    public String sortString(String s) {
        if (s==null || s.length()==0) return "";
        String res = "";
        SortedMap<Integer,Integer> map = new TreeMap<>();
        for (char c : s.toCharArray()){
            map.put(c-'a',map.getOrDefault(c-'a',0)+1);
        }
        int count = 0;
        int len = s.length();
        if (map.isEmpty()) return "0";
        while (count<len){
            for (Map.Entry<Integer,Integer> m : map.entrySet()){
                int key=m.getKey();
                if (m.getValue()>0){
                    char v= (char) (((char)key)+'a');
                    res+=v;
                    map.put(key,m.getValue()-1);
                    count++;
                }
            }
            String str = "";
            for (Map.Entry<Integer,Integer> m : map.entrySet()){
                int key=m.getKey();
                if (m.getValue()>0){
                    char v= (char) (((char)key)+'a');
                    str =  v+str;
                    map.put(key,m.getValue()-1);
                    count++;
                }
            }
            res+=str;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "caaabbbbcccc";
        String res = new IncreasingDecreasingString().sortString(s);
        System.out.println(res);
    }
}
