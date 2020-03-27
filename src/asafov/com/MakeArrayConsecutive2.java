package asafov.com;

import java.util.Arrays;

public class MakeArrayConsecutive2 {

    static int makeArrayConsecutive2(int[] statues) {
        Arrays.sort(statues);
        int ans = 0;
        for (int i = 0;i<statues.length-1;i++){
            if (statues[i]!=statues[i+1]) {
                ans += statues[i + 1] - statues[i] - 1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {

    }
}
