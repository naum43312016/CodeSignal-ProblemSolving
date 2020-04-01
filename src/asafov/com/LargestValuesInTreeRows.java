package asafov.com;

import java.util.ArrayList;
import java.util.List;

public class LargestValuesInTreeRows {

    int[] largestValuesInTreeRows(Tree<Integer> t) {
        List<Integer> list = new ArrayList<>();
        rec(t,list,0);
        int[] res = new int[list.size()];
        for (int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }

    private void rec(Tree<Integer> t, List<Integer> list, int i) {
        if (t==null) return;
        int val = t.value;
        if (list.size()<=i){
            list.add(val);
        }else{
            list.set(i,Math.max(val,list.get(i)));
        }
        rec(t.left,list,i+1);
        rec(t.right,list,i+1);
    }
}
