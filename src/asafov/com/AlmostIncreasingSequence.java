package asafov.com;

public class AlmostIncreasingSequence {

   static boolean almostIncreasingSequence(int[] sequence) {
        if (sequence.length<3) return true;
        int ans = 0;

        for (int i=0;i<sequence.length-1;i++){
            if (sequence[i]>=sequence[i+1]){
                if (i!=0 &&sequence[i+1]<=sequence[i-1]){
                    //swap
                    sequence[i+1] = sequence[i];
                }
                ans++;
            }
        }
        return ans<2;
    }


    public static void main(String[] args) {
        int[] s = {1,3,2};
        System.out.println(almostIncreasingSequence(s));
    }
}
