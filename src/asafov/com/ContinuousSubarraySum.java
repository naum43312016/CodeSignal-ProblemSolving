package asafov.com;

public class ContinuousSubarraySum {

    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums==null || nums.length<2) return false;
        int sum=0;
        if (k==0){
            for (int i=0;i<nums.length;i++){
                sum+=nums[i];
                if (i>0){
                    if (sum==0){
                        return true;
                    }
                }
            }
            return false;
        }
        for (int num : nums){
            sum+=num;
        }
        return helper(nums,sum,k,0,nums.length-1);
    }
    public boolean helper(int[] nums,int sum,int k,int l,int h){
        if (l>=h) return false;
        if(sum%k==0) return true;
        return helper(nums,sum-nums[h],k,l,h-1) || helper(nums,sum-nums[l],k,l+1,h);
    }

    public static void main(String[] args) {
        int[] arr = {23, 2, 4, 6, 7};
        int k=6;
        boolean ans = new ContinuousSubarraySum().checkSubarraySum(arr,k);
        System.out.println(ans);
    }
}
