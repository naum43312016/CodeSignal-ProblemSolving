package asafov.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinarySearchTreetoGreaterSumTree {

    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

    List<Integer> values = new ArrayList<>();
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
        if (root==null) return null;
        traverse(root);
        Collections.sort(values);
        changeTree(root);
        return root;
    }

    private void changeTree(TreeNode root) {
        if (root==null) return;

        int newVal = sum;
        int i=0;
        while (values.get(i)<root.val){
            newVal-=values.get(i);
            i++;
        }
        root.val=newVal;

        changeTree(root.left);
        changeTree(root.right);
    }

    private void traverse(TreeNode root) {
        if (root==null) return;
        sum+=root.val;
        values.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }

    public static void main(String[] args) {

    }
}
