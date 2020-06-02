package asafov.com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteNodesAndReturnForest {


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

    List<TreeNode> list = new ArrayList<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        if (root==null) return list;
        Arrays.sort(to_delete);
        if (Arrays.binarySearch(to_delete,root.val)<0){
            list.add(root);
        }
        delete(null,root,false,to_delete);
        return list;
    }

    private void delete(TreeNode prev,TreeNode node,boolean left, int[] to_delete) {
        if (node==null) return;
        if (Arrays.binarySearch(to_delete,node.val)>=0){
            if (node.left!=null &&
                    Arrays.binarySearch(to_delete,node.left.val)<0){
                list.add(node.left);
                delete(null,node.left,true,to_delete);
            }else{
                delete(null,node.left,true,to_delete);
            }
            if (node.right!=null &&
                    Arrays.binarySearch(to_delete,node.right.val)<0){
                list.add(node.right);
                delete(null,node.right,false,to_delete);
            }else{
                delete(null,node.right,false,to_delete);
            }

            if (prev!=null){
                if (left){
                    prev.left=null;
                }else{
                    prev.right=null;
                }
            }
        }else{
            delete(node,node.left,true,to_delete);
            delete(node,node.right,false,to_delete);
        }
    }

    public static void main(String[] args) {

    }
}
