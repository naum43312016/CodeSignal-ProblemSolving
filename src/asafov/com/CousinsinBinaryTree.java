package asafov.com;

import java.util.HashMap;
import java.util.Map;

public class CousinsinBinaryTree {

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


    Map<TreeNode,Integer> map = new HashMap<>();

    private void traverse(TreeNode prev,TreeNode node, int x, int y,int level){
        if (node==null) return;
        if (node.val==x || node.val==y){
            map.put(prev,level);
        }
        traverse(node,node.left,x,y,level+1);
        traverse(node,node.right,x,y,level+1);
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root==null) return false;
        if (root.val==x || root.val==y) return false;
        traverse(root,root.left,x,y,1);
        traverse(root,root.right,x,y,1);
        if (map.size()<2) return false;
        int l = -1;
        for (Map.Entry<TreeNode,Integer> entry : map.entrySet()){
            if (l==-1){
                l=entry.getValue();
            }else{
                if (l==entry.getValue()) return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

    }
}
