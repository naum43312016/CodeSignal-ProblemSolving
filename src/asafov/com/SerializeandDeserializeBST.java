package asafov.com;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeandDeserializeBST {

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(7);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(9);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(5);
        tree.right.right = new TreeNode(14);
        System.out.println(tree);
        Codec c = new Codec();
        String s = c.serialize(tree);
        TreeNode node  = c.deserialize(s);
        System.out.println(node);
    }
}

class TreeNode {
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

class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root==null) return "";
        StringBuilder str = new StringBuilder();
        ser(root,str);
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data==null || data.length()==0) return null;
        String[] a = data.split("\\.");
        TreeNode root = new TreeNode(Integer.valueOf(a[0]));
        for (int i=1;i<a.length;i++){
            insert(root,Integer.valueOf(a[i]));
        }
        return root;
    }

    public void insert(TreeNode node,int value){
        if (node==null) return;
        if (node.val==value) return;
        if (value<node.val){//left
            if (node.left==null){
                node.left = new TreeNode(value);
                return;
            }else{
                insert(node.left,value);
            }
        }else{//right
            if (node.right==null){
                node.right = new TreeNode(value);
                return;
            }else{
                insert(node.right,value);
            }
        }
    }

    public void ser(TreeNode node,StringBuilder str){
        if (node==null){
            return;
        }
        if (str.length()==0){
            str.append(+node.val);
        }else{
            str.append("."+node.val);
        }
        ser(node.left,str);
        ser(node.right,str);
    }
}