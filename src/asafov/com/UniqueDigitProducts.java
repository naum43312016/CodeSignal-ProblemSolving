package asafov.com;

import java.util.HashSet;
import java.util.Set;

public class UniqueDigitProducts {
    int uniqueDigitProducts(int[] a) {
        Set<Integer> s = new HashSet<>();
        for (int num : a){
            int p = num%10;
            num=num/10;
            while (num>0){
                p*=num%10;
                num=num/10;
            }
            s.add(p);
        }
        return s.size();
    }
}
