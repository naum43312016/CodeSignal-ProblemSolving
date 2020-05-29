package asafov.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BalanceaBinarySearchTree {

    static class TreeNode {
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

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public TreeNode balanceBST(TreeNode root) {
        if (root==null) return null;
        List<Integer> list = new ArrayList<>();
        traverse(root,list);
        Collections.sort(list);
        if (list.size()<2) return root;
        return balance(list,0,list.size()-1);
    }

    public TreeNode balance(List<Integer> list,int start,int end){
        if (start>end) return null;
        int mid = (start+end)/2;
        TreeNode node = new TreeNode(list.get(mid));
        if (start!=end){
            node.left = balance(list,start,mid-1);
            node.right = balance(list,mid+1,end);
        }
        return node;
    }

    private void traverse(TreeNode root,List<Integer> list) {
        if (root==null) return;
        list.add(root.val);
        traverse(root.left,list);
        traverse(root.right,list);
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.right = new TreeNode(2);
        tree.right.right = new TreeNode(3);
        tree.right.right.right = new TreeNode(4);
        TreeNode ans = new BalanceaBinarySearchTree().balanceBST(tree);
        System.out.println(ans);
    }
}
