package asafov.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllElementsinTwoBinarySearchTrees {


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

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        traverse(root1,root2,list);
        if (!list.isEmpty()){
            Collections.sort(list);
        }
        return list;
    }

    private void traverse(TreeNode root1, TreeNode root2,List<Integer> list) {
        if (root1==null && root2==null){
            return;
        }
        if (root1!=null && root2!=null){
            list.add(root1.val);
            list.add(root2.val);
            traverse(root1.left, root2.left,list);
            traverse(root1.right, root2.right,list);
        }else if(root1!=null){
            list.add(root1.val);
            traverse(root1.left, null,list);
            traverse(root1.right, null,list);
        }else{
            list.add(root2.val);
            traverse(null, root2.left,list);
            traverse(null, root2.right,list);
        }
    }

    public static void main(String[] args) {

    }
}
