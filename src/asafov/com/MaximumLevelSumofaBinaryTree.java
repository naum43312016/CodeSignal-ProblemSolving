package asafov.com;

import java.util.HashMap;
import java.util.Map;

public class MaximumLevelSumofaBinaryTree {


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

    Map<Integer,Integer> map = new HashMap<>();
    public int maxLevelSum(TreeNode root) {
        traverse(root,1);
        int maxVal=Integer.MIN_VALUE;
        int indx=0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue()>maxVal){
                maxVal=entry.getValue();
                indx=entry.getKey();
            }
        }
        return indx;
    }

    private void traverse(TreeNode root, int level) {
        if (root==null) return;
        if (map.containsKey(level)){
            int sum = map.get(level);
            sum+=root.val;
            map.put(level,sum);
        }else{
            map.put(level,root.val);
        }
        traverse(root.left,level+1);
        traverse(root.right,level+1);
    }

    public static void main(String[] args){

    }
}
