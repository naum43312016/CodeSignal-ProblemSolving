package asafov.com;

public class DeleteFromBST {

    static Tree<Integer> deleteFromBST(Tree<Integer> t, int[] queries) {
        TreeRemove rem = new TreeRemove(t);
        for (int i: queries){
            rem.remove(i);
        }
        return rem.getRoot();
    }

    public static void main(String[] args) {
        Tree<Integer> t = new Tree<>(5);
        t.left = new Tree<>(2);
        t.right = new Tree<>(6);
        t.right.right = new Tree<>(8);
        t.right.right.left = new Tree<>(7);
        t.left.left = new Tree<>(1);
        t.left.right = new Tree<>(3);
        t=deleteFromBST(t,new int[]{5,2,6,3,1,8});//1
        System.out.println(t);
    }

}

class TreeRemove{
    private Tree<Integer> root;

    public Tree<Integer> getRoot() {
        return root;
    }

    public TreeRemove(Tree<Integer> root) {
        this.root = root;
    }

    public void remove(Integer value) {
        if (root==null){
            return;
        }
        if (root.value.compareTo(value)==0){
            removeRoot(value);
            return;
        }
        removeFromTree(value,root,root);
    }
    private void removeRoot(Integer value){
        if (root.left==null && root.right==null){
            root=null;
            return;
        }
        if (root.left!=null){
            if (root.left.right!=null){
                root.value = root.left.right.value;
                removeFromTree(root.left.right.value, root.left.right,root.left);
            }else {
                root.value = root.left.value;
                removeFromTree(root.left.value, root.left,root);
            }
        }else {
            //swap
            root.value = root.right.value;
            removeFromTree(root.right.value, root.right,root);
        }

    }

    private void removeFromTree(Integer value,Tree<Integer> currentNode,Tree<Integer> prevNode){
        if (currentNode!=null){
            if (value.compareTo(currentNode.value)==0){
                if (currentNode.right == null && currentNode.left == null){
                    removeLeaf(prevNode,currentNode);
                }else if (currentNode.right!=null && currentNode.left != null){
                    removeIfTwoChild(currentNode);
                }else{
                    removeIfOneChild(prevNode,currentNode);
                }

            }else if (value.compareTo(currentNode.value)>0){
                removeFromTree(value,currentNode.right,currentNode);
            }else if (value.compareTo(currentNode.value)<0){
                removeFromTree(value,currentNode.left,currentNode);
            }
        }
    }

    private void removeIfTwoChild(Tree<Integer> currentNode){
        Tree<Integer> successor = currentNode.right;
        while (successor.left!=null){
            successor = successor.left;
        }
        Integer value = successor.value;
        removeFromTree(value,root,root);
        currentNode.value = value;
    }


    private void removeIfOneChild(Tree<Integer> prevNode,Tree<Integer> currentNode){

        if (prevNode.right!=null) {
            if (prevNode.right.value.equals(currentNode.value)) {
                if (currentNode.right != null) {
                    prevNode.right = currentNode.right;
                    currentNode.right = null;
                    currentNode.left = null;
                } else {
                    prevNode.right = currentNode.left;
                    currentNode.right = null;
                    currentNode.left = null;
                }
            }
        }


        if (prevNode.left!=null) {
            if (prevNode.left.value.equals(currentNode.value)) {
                if (currentNode.right != null) {
                    prevNode.left = currentNode.right;
                    currentNode.right = null;
                    currentNode.left = null;
                } else {
                    prevNode.left = currentNode.left;
                    currentNode.right = null;
                    currentNode.left = null;
                }
            }
        }
    }

    private void removeLeaf(Tree<Integer> prevNode,Tree<Integer> currentNode){
        if (prevNode.right!=null){
            if (prevNode.right.value.equals(currentNode.value)){
                prevNode.right = null;
            }
        }
        if (prevNode.left!=null){
            if (prevNode.left.value.equals(currentNode.value)){
                prevNode.left = null;
            }
        }

    }
}
