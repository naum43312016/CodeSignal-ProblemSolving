package asafov.com;

import java.util.Arrays;

public class MatrixBlockSum {
/*

Given a m * n matrix mat and an integer K,
return a matrix answer where each answer[i][j]
is the sum of all elements mat[r][c]
for i - K <= r <= i + K, j - K <= c <= j + K, and (r, c) is a valid position in the matrix.
 */

    public int[][] matrixBlockSum(int[][] mat, int K) {
        int n = mat.length;
        if (n==0) return mat;
        int m = mat[0].length;
        int[][] answer = new int[n][m];
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                matrixChange(mat,i,j,K,n,m,answer);
            }
        }
        return answer;
    }

    private void matrixChange(int[][] mat, int i, int j, int k,int n,int m,int[][] answer) {
        int startR = i-k;
        if (startR<0){
            startR = 0;
        }
        if (startR>=n) return;
        int endR = i+k;
        if (endR>=n){
            endR = n-1;
        }

        int startC = j-k;
        if (startC<0){
            startC = 0;
        }
        if (startC>=m) return;
        int endC = j+k;
        if (endC>=m){
            endC = m-1;
        }


        int val = 0;
        while (startR<=endR){
            int x = startC;
            while (x<=endC){
                val+=mat[startR][x];
                x++;
            }
            startR++;
        }
        answer[i][j]=val;
    }

    public static void main(String[] args) {
        int[][] mat = {
                 {1,2,3}
                ,{4,5,6}
                ,{7,8,9}};
        int K = 1;
        int[][] answer = new MatrixBlockSum().matrixBlockSum(mat,K);
        for (int[] a : answer){
            System.out.println(Arrays.toString(a));
        }
    }
}
