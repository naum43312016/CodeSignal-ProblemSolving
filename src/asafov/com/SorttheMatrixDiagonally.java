package asafov.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SorttheMatrixDiagonally {

    public int[][] diagSortViaInsertionSort(int[][] mat){
        if (mat.length<2) return mat;
        int n=mat.length;
        int m=mat[0].length;
        for (int i=0;i<mat.length-1;i++){
            for (int j=0;j<mat[i].length-1;j++){
                int k=i+1;
                int z=j+1;
                while (k<n && z<m){
                    int key = mat[k][z];
                    int y = k-1;
                    int u = z-1;
                    while (y>=i && u>=j && mat[y][u] > key){
                        mat[y+1][u+1] = mat[y][u];
                        y--;
                        u--;
                    }
                    mat[y+1][u+1] = key;
                    k++;
                    z++;
                }
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {3,3,1,1},{2,2,1,2},{1,1,1,2}
        };

        new SorttheMatrixDiagonally().diagSortViaInsertionSort(arr);
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
