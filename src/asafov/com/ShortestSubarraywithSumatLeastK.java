package asafov.com;

import java.util.*;

/*
Return the length of the shortest, non-empty, contiguous subarray of A with sum at least K.
If there is no non-empty subarray with sum at least K, return -1.
 */
public class ShortestSubarraywithSumatLeastK {

    public int shortestSubarray(int[] A, int K) {
        if (A==null || A.length<1) return -1;
        int ans=A.length+1;
        //SubArray ans=null;
        //Queue<SubArray> q = new LinkedList<>();
        Map<Integer, List<SubArray>> map = new HashMap<>();
        for (int i=0;i<A.length;i++){
            if (A[i]>=K){
                return 1;
            }
            if (i==0){
                List<SubArray> list = new LinkedList<>();
                SubArray sub = new SubArray(1,A[i]);
                list.add(sub);
                map.put(i,list);
            }else{
                int lastIndx = i-1;
                List<SubArray> list = map.get(lastIndx);
                int val = A[i];
                for (SubArray s : list){
                    s.len++;
                    s.sum+=val;
                    if (s.sum>=K){
                        ans=Math.min(ans,s.len);
                    }
                }
                SubArray sub = new SubArray(1,A[i]);
                list.add(sub);
                map.put(i,list);
            }
        }
        if (ans==A.length+1) return -1;
        return ans;
    }

    class SubArray{
        int len;
        int sum;

        public SubArray(int len, int sum) {
            this.len = len;
            this.sum = sum;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2};
        int k=4;
        System.out.println(new ShortestSubarraywithSumatLeastK().shortestSubarray(arr,k));
    }
}
