package asafov.com;


public class SumInRange {

    int sumInRange(int[] nums, int[][] queries) {

        long res=0;
        for (int[] arr : queries){
            int i=arr[0];
            int j=arr[1];
            long sum=0;
            while (i<=j){
                sum+=nums[i];
                i++;
            }
            res+=sum;
        }
        if (res<0){
            res=0-res;
            long n = 1000000007-res;
            int ans = (int)n;
            return ans;
        }
        return (int)Math.floor(res%(Math.pow(10,9)+7));
    }

}
