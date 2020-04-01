package asafov.com;

import java.util.*;

public class ContainsCloseNums {

    boolean containsCloseNums(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i=0;i< nums.length;i++){
            if (map.containsKey(nums[i])){
                List<Integer> list = map.get(nums[i]);
                for (int index : list){
                    if (Math.abs(i-index)<=k) return true;
                }
                list.add(i);
                map.put(nums[i],list);
            }else {
                List<Integer> list = new LinkedList<>();
                list.add(i);
                map.put(nums[i],list);
            }
        }
        return false;
    }

}
