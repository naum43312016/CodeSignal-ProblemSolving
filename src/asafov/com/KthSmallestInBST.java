package asafov.com;

import java.util.LinkedList;
import java.util.List;

public class KthSmallestInBST {

    static int kthSmallestInBST(Tree<Integer> t, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        inorder(t,list,k);
        return list.get(list.size()-1);
    }

    static void inorder(Tree<Integer> node,LinkedList<Integer> list,int k)
    {
        if (node == null)
            return;

        if (list.size()==k) return;

        inorder(node.left,list,k);

        if (list.size()==k) return;
        list.add(node.value);

        if (list.size()==k) return;
        inorder(node.right,list,k);
    }

    public static void main(String[] args) {
        Tree<Integer> t = new Tree<>(1);
        t.left = new Tree<>(-2);
        t.left.left = new Tree<>(-2);
        t.left.right = new Tree<>(0);
        System.out.println(kthSmallestInBST(t,1));
    }

}
