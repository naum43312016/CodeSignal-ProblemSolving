package asafov.com;

public class IsSubtree {

    static boolean isSubtree(Tree<Integer> t1, Tree<Integer> t2) {
        if (t1==null && t2==null) return true;
        if (t2==null || t1==null) return false;

        if (t1.value.compareTo(t2.value)==0){
            return compare(t1.left,t2.left) && compare(t1.right,t2.right);
        }
        return isSubtree(t1.left,t2) || isSubtree(t1.right,t2);

    }

    static private boolean compare(Tree<Integer> t1, Tree<Integer> t2) {
        if (t1==null && t2==null) return true;
        if (t2==null || t1==null) return false;
        if (t1.value.compareTo(t2.value)!=0){
            return false;
        }
        return compare(t1.left,t2.left) && compare(t1.right,t2.right);
    }

    public static void main(String[] args) {
        Tree<Integer> t1 = new Tree<>(5);
        t1.left = new Tree<>(10);
        t1.right = new Tree<>(7);
        t1.left.left = new Tree<>(4);
        t1.left.right = new Tree<>(6);
        t1.left.left.left = new Tree<>(1);
        t1.left.left.right = new Tree<>(2);
        t1.left.right.right = new Tree<>(-1);


        Tree<Integer> t2 = t1.left;
        System.out.println(isSubtree(t1,t2));
    }

}
