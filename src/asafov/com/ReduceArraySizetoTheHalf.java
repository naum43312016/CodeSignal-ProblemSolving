package asafov.com;

import java.util.*;

public class ReduceArraySizetoTheHalf {


    public int minSetSize(int[] arr) {
        int ans=0;
        if (arr.length==0) return 0;
        int len=arr.length;
        int half=len/2;
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int n :  values){
            len-=n;
            ans++;
            if (len<=half){
                return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
