package asafov.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CreateTargetArray {

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>(nums.length);
        for (int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        int[] arr = new int[list.size()];
        for (int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }


    public static void main(String[] args) {

    }
}
