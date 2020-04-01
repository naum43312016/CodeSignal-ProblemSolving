package asafov.com;

public class HasPathWithGivenSum {

    boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
        if (t==null) return false;
         return rec(t,0,s);
    }

    boolean rec(Tree<Integer> t,int sum,int s){
        if (t==null) return false;
        if (t.left==null && t.right==null){
            sum+=t.value;
            if (sum==s) return true;
        }
        return rec(t.left,sum+t.value,s) || rec(t.right,sum+t.value,s);
    }

}
