package asafov.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringsConstruction {

    int stringsConstruction(String a, String b) {
        if (a.length()==0 || b.length()==0) return 0;
        int ans=0;
        char[]arrA = a.toCharArray();
        char[]arrB = b.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<arrB.length;i++){
           map.put(arrB[i],map.getOrDefault(arrB[i],0)+1);
        }
        int count=0;
        int len=arrA.length;
        int i=0;
        while (i<arrA.length){
            if (map.containsKey(arrA[i])){
                int l = map.get(arrA[i]);
                if (l>0){
                    count++;
                    map.put(arrA[i],l-1);
                }
            }
            if (i==len-1){
                if (count!=len){
                  return ans;
                }else {
                    count=0;
                    ans++;
                    i=-1;
                }
            }
            i++;
        }
        return ans;
    }

}
