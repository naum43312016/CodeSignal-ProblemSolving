package asafov.com;

public class AdjacentElementsProduct {

    int adjacentElementsProduct(int[] inputArray) {
        if (inputArray==null || inputArray.length==0) return 0;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<inputArray.length-1;i++){
            max = Math.max(max,inputArray[i]*inputArray[i+1]);
        }
        return max;
    }


    public static void main(String[] args) {

    }
}
