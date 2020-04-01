package asafov.com;

import java.util.*;

/*
Note: Try to solve this task without using recursion, since this is what you'll be asked to do during an interview.
Given a binary tree of integers t, return its node values in the following format:
 */
public class TraverseTree {

    static int[] traverseTree(Tree<Integer> t) {
        if (t==null) return new int[]{};
        List<Integer> list = new ArrayList<>();
        Queue<Tree<Integer>> q = new LinkedList<>();
        q.add(t);
        while (!q.isEmpty()){
            Tree<Integer> node = q.poll();
            list.add(node.value);
            if (node.left!=null) {
                q.add(node.left);
            }
            if (node.right!=null) {
                q.add(node.right);
            }
        }
        int[] res = new int[list.size()];
        for (int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }


    public static void main(String[] args) {
        Tree<Integer> t = new Tree<>(1);
        t.left = new Tree<>(2);
        t.right = new Tree<>(4);
        t.left.right = new Tree<>(3);
        t.right.left = new Tree<>(5);
        traverseTree(t);
    }
}
