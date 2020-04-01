package asafov.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DigitTreeSum {
    static long ans = 0;
    static long digitTreeSum(Tree<Integer> t) {
        if (t==null) return 0;
        List<String> list = new ArrayList<>();
        traverse(list,t,"");
        return ans;
    }

    static private void traverse(List<String> list, Tree<Integer> t, String s) {
        s+=t.value;
        if (t.left==null && t.right==null){
            ans+=Long.valueOf(s);
            return;
        }
        if (t.left!=null) traverse(list,t.left,s);
        if (t.right!=null) traverse(list,t.right,s);
    }

    public static void main(String[] args) {
        Tree<Integer> t=new Tree<>(1);
        t.left=new Tree<>(0);
        t.left.left=new Tree<>(3);
        t.left.right=new Tree<>(1);
        t.right=new Tree<>(4);
        System.out.println(digitTreeSum(t));
    }
}
