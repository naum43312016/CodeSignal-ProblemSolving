package asafov.com;

public class BinarySubarraysWithSum {

    public int numSubarraysWithSum(int[] A, int S) {
        int ans=0;
        for (int i=0;i<A.length;i++){
            int sum=0;
            for (int j=i;j<A.length;j++){
                sum+=A[j];
                if (sum==S){
                    ans++;
                }else if(sum>S){
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
