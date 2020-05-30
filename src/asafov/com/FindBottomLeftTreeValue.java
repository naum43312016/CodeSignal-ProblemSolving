package asafov.com;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindBottomLeftTreeValue {


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

    int lastLevel=0;
    Map<Integer, Integer> map = new HashMap<>();
    public int findBottomLeftValue(TreeNode root) {
        traverse(root,0);
        return map.get(lastLevel);
    }

    private void traverse(TreeNode root, int level) {
        if (root==null) return;
        lastLevel=Math.max(lastLevel,level);
        if (level>=lastLevel){
            if (!map.containsKey(level)) {
                map.put(level,root.val);
            }
        }
        traverse(root.left,level+1);
        traverse(root.right,level+1);
    }

    public static void main(String[] args) {

    }
}
