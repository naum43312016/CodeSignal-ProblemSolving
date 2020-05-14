package asafov.com;

public class BinarySearchTreefromPreorder {

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

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    int index = 1;
    TreeNode root;

    public TreeNode bstFromPreorder(int[] preorder) {
        root = new TreeNode(preorder[0]);
        buildTree(root, preorder);
        return root;
    }

    private void buildTree(TreeNode node, final int[] array) {
        if(index >= array.length || node == null) {
            return;
        }

        if (node.val > array[index]) {
            if(node.left == null) {
                node.left = new TreeNode(array[index]);
            } else {
                buildTree(node.left, array);
            }
        } else {
            if(node.right == null) {
                node.right = new TreeNode(array[index]);
            } else {
                buildTree(node.right, array);
            }
        }

        index++;
        buildTree(root, array);
    }

    public static void main(String[] args) {
        int[] arr = {8,5,1,7,10,12};
        System.out.println(new BinarySearchTreefromPreorder().bstFromPreorder(arr));
    }
}
