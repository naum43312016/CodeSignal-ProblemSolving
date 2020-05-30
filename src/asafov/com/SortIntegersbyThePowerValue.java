package asafov.com;

import java.util.*;

public class SortIntegersbyThePowerValue {

    public int getKth(int lo, int hi, int k) {
        SortedMap<Integer, List<Integer>> map = new TreeMap<>();
        while (lo<=hi){
            int num = lo;
            int count = 0;
            while (num!=1){
                if (num%2==0){
                    num=num/2;
                }else{
                    num=3*num+1;
                }
                count++;
            }
            if (map.containsKey(count)){
                List<Integer> list = map.get(count);
                list.add(lo);
                map.put(count,list);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(lo);
                map.put(count,list);
            }
            lo++;
        }
        int i=1;
        for (Map.Entry<Integer,List<Integer>> entry : map.entrySet()){
            List<Integer> list = entry.getValue();
            for (int num : list){
                if (i==k){
                    return num;
                }
                i++;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new SortIntegersbyThePowerValue().getKth(12,15,2));
    }
}
