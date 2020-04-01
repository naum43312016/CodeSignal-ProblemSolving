package asafov.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumbersGrouping {

    static int numbersGrouping(int[] a) {
        if (a.length==0) return 0;
        int len = a.length;
        double d = 10000.0;
        Set<Double> s = new HashSet<>();
        for (int i=0;i<a.length;i++){
            double n = a[i]/d;
              s.add(Math.ceil(n));
        }
        return len+s.size();
    }

    public static void main(String[] args) {
    }

}