package asafov.com;

import java.util.HashMap;
import java.util.Map;

public class AreFollowingPatterns {

    boolean areFollowingPatterns(String[] strings, String[] patterns) {
        if (strings.length!=patterns.length) return false;
        Map<String,String> map = new HashMap<>();
        for (int i=0;i<strings.length;i++){
            if (!map.containsKey(strings[i])){
                String p = patterns[i];
                if (map.containsValue(p)) return false;
                map.put(strings[i],p);
            }else{
                String str = map.get(strings[i]);
                if (!str.equals(patterns[i])){
                    return false;
                }
            }
        }
        return true;
    }


}
