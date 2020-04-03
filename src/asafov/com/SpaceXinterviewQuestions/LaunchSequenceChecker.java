package asafov.com.SpaceXinterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LaunchSequenceChecker {

    boolean launchSequenceChecker(String[] systemNames, int[] stepNumbers) {
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i=0;i<systemNames.length;i++){
            if (map.containsKey(systemNames[i])){
                List<Integer> l = map.get(systemNames[i]);
                l.add(stepNumbers[i]);
                map.put(systemNames[i],l);
            }else{
                List<Integer> l = new ArrayList<>();
                l.add(stepNumbers[i]);
                map.put(systemNames[i],l);
            }
        }
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()){
            List<Integer> l = entry.getValue();
            if (l.size()>1){
                int i=1;
                while (i<l.size()){
                    if (l.get(i)<=l.get(i-1)){
                        return false;
                    }
                    i++;
                }
            }
        }
        return true;
    }

}
