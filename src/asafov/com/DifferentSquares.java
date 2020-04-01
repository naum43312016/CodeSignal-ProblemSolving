package asafov.com;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferentSquares {
    int differentSquares(int[][] matrix) {
        Set<String> set = new HashSet<>();
        for (int i=0;i<matrix.length-1;i++){
            for (int j=0;j<matrix[i].length-1;j++){
                String square = ""+matrix[i][j]+matrix[i][j+1]+matrix[i+1][j]+matrix[i+1][j+1];
                set.add(square);
            }
        }
        return set.size();
    }


}
