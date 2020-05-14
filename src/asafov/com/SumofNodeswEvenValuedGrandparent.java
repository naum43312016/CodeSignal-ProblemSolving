package asafov.com;

public class SumofNodeswEvenValuedGrandparent {

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


    int ans=0;
    public int sumEvenGrandparent(TreeNode root) {
        if (root==null) return 0;
        rec(root);
        return ans;
    }

    private void rec(TreeNode root) {
        if (root==null) return;
        if (root.left==null && root.right==null) return;
        if (root.val%2==0){
            if (root.left!=null && root.left.left!=null){
                ans+=root.left.left.val;
            }
            if (root.left!=null && root.left.right!=null){
                ans+=root.left.right.val;
            }
            if (root.right!=null && root.right.left!=null){
                ans+=root.right.left.val;
            }
            if (root.right!=null && root.right.right!=null){
                ans+=root.right.right.val;
            }
        }
        rec(root.left);
        rec(root.right);
    }

    public static void main(String[] args) {

    }

}
