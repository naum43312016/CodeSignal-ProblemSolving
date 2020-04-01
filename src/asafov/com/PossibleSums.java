package asafov.com;

import java.util.HashSet;

public class PossibleSums {

    int possibleSums(int[] coins, int[] quantity) {
        HashSet<Integer> sums = new HashSet<Integer>();
        sums.add(0);

        for(int i=0; i<coins.length; i++) {
            int coin = coins[i];
            HashSet<Integer> currentSums = new HashSet<Integer>();
            for(Integer sum : sums) {
                for(int j=1; j<=quantity[i]; j++) {
                    currentSums.add(sum + coin*j);
                }
            }
            sums.addAll(currentSums);
        }

        return sums.size() - 1;
    }



}
