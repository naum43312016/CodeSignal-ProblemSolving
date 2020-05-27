package asafov.com;

import java.util.*;

public class GroupthePeopleGiventheGroupSize {

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> lists = new LinkedList<>();
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<groupSizes.length;i++){
            if (map.containsKey(groupSizes[i])){
                List<Integer> list = map.get(groupSizes[i]);
                list.add(i);
                if (list.size()==groupSizes[i]){
                    lists.add(list);
                    map.remove(groupSizes[i]);
                }else {
                    map.put(groupSizes[i], list);
                }
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                if (list.size()==groupSizes[i]){
                    lists.add(list);
                }else {
                    map.put(groupSizes[i], list);
                }
            }
        }
        return lists;
    }


    public static void main(String[] args) {
        int[] arr={3,3,3,3,3,1,3};
        List<List<Integer>> l = new GroupthePeopleGiventheGroupSize().groupThePeople(arr);
        for (List<Integer>li : l){
            System.out.println(li.toString());
        }
    }
}
