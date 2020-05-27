package asafov.com;

import java.util.LinkedList;

public class CountGoodNodesinBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
    int res = 0;
    public int goodNodes(TreeNode root) {
        if (root==null) return 0;
        traverse(root,new LinkedList<>());
        return res;
    }

    public void traverse(TreeNode node,LinkedList<Integer> list){
        if (node==null) return;
        int val = node.val;
        list.add(val);
        boolean hasBV=false;
        for (Integer integer : list) {
            if (integer > val) {
                hasBV = true;
                break;
            }
        }
        if (!hasBV){
            res++;
        }
        traverse(node.left,list);
        if (node.left!=null && list.size()>0)
        {
            list.removeLast();
        }
        traverse(node.right,list);
        if (node.right!=null && list.size()>0)
        {
            list.removeLast();
        }
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(1);
        tree.left.left = new TreeNode(3);

        tree.right = new TreeNode(4);
        tree.right.left = new TreeNode(1);
        tree.right.right = new TreeNode(5);

        int n = new CountGoodNodesinBinaryTree().goodNodes(tree);
        System.out.println(n);
    }
}
