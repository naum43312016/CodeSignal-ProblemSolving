package asafov.com;

import java.util.HashSet;
import java.util.Set;

public class MatrixElementsSum {

    int matrixElementsSum(int[][] matrix) {
        int cost = 0;
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<matrix.length;i++){
            for (int j = 0;j<matrix[i].length;j++){
                if (!set.contains(j)){
                    if (matrix[i][j]==0){
                        set.add(j);
                    }else {
                        cost+=matrix[i][j];
                    }
                }
            }
        }
        return cost;
    }


    public static void main(String[] args) {

    }
}
