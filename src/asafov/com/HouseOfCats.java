package asafov.com;

import java.util.ArrayList;
import java.util.List;

public class HouseOfCats {

    static int[] houseOfCats(int legs) {
        if (legs<2) return new int[]{0};
        if (legs==2) return new int[]{1};
        List<Integer> l = new ArrayList<>();
        if (legs%4==0) l.add(0);
        int human = 0;
        while (legs>0){
            legs-=2;
            human++;
            if (legs%4==0){
                l.add(human);
            }
        }
        int[] arr = new int[l.size()];
        for (int i=0;i<arr.length;i++){
            arr[i]=l.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        houseOfCats(44);
    }

}
