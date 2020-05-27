package asafov.com;

public class BinaryTreePruning {

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

    public TreeNode pruneTree(TreeNode root) {
        if (root==null) return null;
        traverse(root);
        return root;
    }

    private void traverse(TreeNode root) {
        if (root==null) return;
        if (checkSubTree(root.left)){
            root.left=null;
        }
        if (checkSubTree(root.right)){
            root.right=null;
        }
        traverse(root.left);
        traverse(root.right);
    }

    private boolean checkSubTree(TreeNode root) {
        if (root==null) return true;
        if (root.val==1) return false;
        return checkSubTree(root.left) && checkSubTree(root.right);
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(0);
        tree.right = new TreeNode(1);
        tree.right.left = new TreeNode(0);
        tree.right.right = new TreeNode(1);
        tree.left.left = new TreeNode(0);
        tree.left.right = new TreeNode(0);
        TreeNode n  = new BinaryTreePruning().pruneTree(tree);
        System.out.println(n);
    }
}
