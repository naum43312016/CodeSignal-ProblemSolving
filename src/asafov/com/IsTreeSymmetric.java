package asafov.com;

import java.util.*;

public class IsTreeSymmetric {

    boolean isTreeSymmetric(Tree<Integer> t) {
        if (t == null) {
            return true;
        }
        return helper(t.left, t.right);
    }
    boolean helper(Tree<Integer> left, Tree<Integer> right) {
        //base case
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        // ask a boolean from left, a boolean from right and return result upwards
        return (left.value.equals(right.value)) && helper(left.left, right.right) && helper(left.right, right.left);
    }

}
