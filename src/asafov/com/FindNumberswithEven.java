package asafov.com;

public class FindNumberswithEven {

    public int findNumbers(int[] nums) {
        int ans=0;
        for (int num : nums){
            if ((String.valueOf(num).length())%2==0){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
