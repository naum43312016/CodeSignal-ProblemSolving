package asafov.com;

import java.util.Arrays;

public class Minesweeper {
    static int[][] minesweeper(boolean[][] matrix) {
        int[][] res = new int[matrix.length][matrix[0].length];

        for (int i=0;i<res.length;i++){
            for (int j=0;j<res[0].length;j++){
                res[i][j] = countMines(matrix,i,j);
            }
        }
        return res;
    }

    private static int countMines(boolean[][] matrix, int i, int j) {
        int sum = 0;
        try {
           if (matrix[i][j+1]) sum++;
        }catch (IndexOutOfBoundsException e){}
        try {
            if (matrix[i][j-1]) sum++;
        }catch (IndexOutOfBoundsException e){}
        try {
            if (matrix[i+1][j]) sum++;
        }catch (IndexOutOfBoundsException e){}
        try {
            if (matrix[i-1][j]) sum++;
        }catch (IndexOutOfBoundsException e){}
        try {
            if (matrix[i-1][j-1]) sum++;
        }catch (IndexOutOfBoundsException e){}
        try {
            if (matrix[i-1][j+1]) sum++;
        }catch (IndexOutOfBoundsException e){}
        try {
            if (matrix[i+1][j+1]) sum++;
        }catch (IndexOutOfBoundsException e){}
        try {
            if (matrix[i+1][j-1]) sum++;
        }catch (IndexOutOfBoundsException e){}
        return sum;
    }


    public static void main(String[] args) {
        boolean[][] b = {{true,false,false},{false,true,false},{false,false,false}};
        int[][] a = minesweeper(b);
        for (int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
