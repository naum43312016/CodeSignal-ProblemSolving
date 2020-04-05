package asafov.com;

import java.util.*;

public class PairOfShoes {

    static boolean pairOfShoes(int[][] shoes) {
        if (shoes.length<2) return false;
        List<Integer> l0=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        for (int[] arr : shoes){
            if (arr[0]==0){
                l0.add(arr[1]);
            }else {
                l1.add(arr[1]);
            }
        }
        Collections.sort(l0);
        Collections.sort(l1);
        return l0.equals(l1);
    }


}
