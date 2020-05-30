package asafov.com;

import java.util.Arrays;

public class PartitionArrayforMaximumSum {

    public int maxSumAfterPartitioning(int[] A, int K) {
        int[] dp = new int[A.length+1];
        for (int i = A.length-1; i >= 0; i--) {
            int max = 0;
            for (int j = i; j < Math.min(A.length, i+K); j++) {
                max = Math.max(A[j], max);
                dp[i] = Math.max(max*(j-i+1) + dp[j+1], dp[i]);
            }
        }
        return dp[0];
    }


    public static void main(String[] args) {
        int[] a = {1,15,7,9,2,5,10};
        System.out.println(new PartitionArrayforMaximumSum().maxSumAfterPartitioning(a,3));
    }
}
