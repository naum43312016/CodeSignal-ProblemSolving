package asafov.com;

public class ArrayMaxConsecutiveSum {

    int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int max = 0;
        for (int i = 0;i<inputArray.length;i++){
            int sum = 0;
            int j = i;
            int z = k;
            if (j+k-1 >=inputArray.length) break;
            while (z>0){
                sum+=inputArray[j++];
                z--;
            }
            max = Math.max(max,sum);
        }
        return max;
    }

}
