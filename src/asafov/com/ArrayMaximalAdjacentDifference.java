package asafov.com;

public class ArrayMaximalAdjacentDifference {
    int arrayMaximalAdjacentDifference(int[] inputArray) {
        int max = Math.abs(inputArray[0]-inputArray[1]);
        int i = 0;
        while (i<inputArray.length-1){
            max = Math.max(max,Math.abs(inputArray[i]-inputArray[i+1]));
            i++;
        }
        return max;
    }

}
