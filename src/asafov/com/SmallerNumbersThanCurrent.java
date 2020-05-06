package asafov.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SmallerNumbersThanCurrent {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if (j!=i){
                    if (nums[i]>nums[j]){
                        ans[i]=ans[i]+1;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
