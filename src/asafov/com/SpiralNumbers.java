package asafov.com;

import java.util.Arrays;

public class SpiralNumbers {
    int[][] spiralNumbers(int n) {
        int[][] array = new int[n][n];

        int left = 0;
        int right = n - 1;
        int top = 0;
        int down = n - 1;

        for (int counter = 1; counter <= n * n; )
        {
            for (int x = left; x <= right; x++)
                array[top][x] = counter++;
            top++;

            for (int y = top; y <= down; y++)
                array[y][right] = counter++;
            right--;

            for (int x = right; x >= left; x--)
                array[down][x] = counter++;
            down--;

            for (int y = down; y >= top; y--)
                array[y][left] = counter++;
            left++;
        }

        return array;
    }

}
