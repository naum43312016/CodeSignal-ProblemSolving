package asafov.com;

import java.util.Stack;

public class RestoreBinaryTree {
    Tree<Integer> restoreBinaryTree(int[] inorder, int[] preorder) {
        int j = 0;
        Stack<Tree<Integer>> stack = new Stack<>();
        Tree<Integer> root = new Tree<>(preorder[0]);
        stack.push(root);
        Tree<Integer> node = root;
        for (int i = 1; i < preorder.length; i++) {
            boolean popped= false;
            while (!stack.isEmpty() && stack.peek().value.equals(inorder[j])) {
                j++;
                node = stack.pop();
                popped = true;
            }
            if( popped){
                Tree<Integer> next = new Tree<>(preorder[i]);
                node.right = next;
                stack.push(next);
                continue;
            }
            Tree<Integer> next = new Tree<>(preorder[i]);
            stack.peek().left = next;
            stack.push(next);
        }
        return root;
    }

}
