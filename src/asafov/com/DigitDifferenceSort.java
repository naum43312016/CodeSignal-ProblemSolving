package asafov.com;

import java.util.*;

public class DigitDifferenceSort {

    int[] digitDifferenceSort(int[] a) {
        int[] list = new int[a.length];
        Stack[] s = new Stack[10];
        for (int i = 0; i < 10; i++)
            s[i] = new Stack();

        for (int i : a)
            s[digits(i)].push(i);

        int c = 0;
        for (int i = 0; i < 10; i++) {
            while (!s[i].isEmpty()) {
                list[c] = (int)s[i].pop();
                c++;
            }
        }

        return list;
    }

    int digits (int a) {
        int max = a%10;
        int min = a%10;
        while (a > 0) {
            if (a%10 > max)
                max = a%10;
            if (a%10 < min)
                min = a%10;
            a /= 10;
        }
        return max - min;
    }


}
