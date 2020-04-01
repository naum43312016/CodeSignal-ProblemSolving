package asafov.com;

public class Tree<T> {
   Tree(T x) {
     value = x;
   }
   T value;
   Tree<T> left;
   Tree<T> right;


   @Override
   public String toString() {
      return "Tree{" +
              "value=" + value +
              ", left=" + left +
              ", right=" + right +
              '}';
   }
}