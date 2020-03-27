package asafov.com;

import java.util.Arrays;

public class ElectionsWinners {

    int electionsWinners(int[] votes, int k) {
        int ans = 0;
        Arrays.sort(votes);
        int max = votes[votes.length-1];
        if (max+k>votes[votes.length-2]){
            ans++;
        }
        for (int i=votes.length-2;i>=0;i--){
            int v = votes[i]+k;
            if (v>max) ans++;
        }
        return ans;
    }

}
