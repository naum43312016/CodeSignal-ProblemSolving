package asafov.com;

import java.util.ArrayList;
import java.util.List;

public class FindLargestValueinEachTreeRow {

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
    List<Integer> list = new ArrayList<>();
    public List<Integer> largestValues(TreeNode root) {
        traverse(root,0);
        return list;
    }

    private void traverse(TreeNode root, int level) {
        if (root==null) return;
        if (level>=list.size()){
            list.add(root.val);
        }else{
            if (root.val>list.get(level)){
                list.set(level,root.val);
            }
        }
        traverse(root.left,level+1);
        traverse(root.right,level+1);
    }

    public static void main(String[] args) {


    }
}
