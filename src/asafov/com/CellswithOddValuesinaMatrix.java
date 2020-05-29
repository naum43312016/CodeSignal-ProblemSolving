package asafov.com;

public class CellswithOddValuesinaMatrix {

    public int oddCells(int n, int m, int[][] indices) {
        int ans=0;
        int[][] arr = new int[n][m];
        for (int[] indx : indices){
            int row = indx[0];
            int col = indx[1];
            int i = 0;
            while (i<m){
                arr[row][i]++;
                i++;
            }
            i=0;
            while (i<n){
                arr[i][col]++;
                i++;
            }
        }

        for (int[] a : arr){
            for (int num : a){
                if (num%2!=0){
                    ans++;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {

    }
}
