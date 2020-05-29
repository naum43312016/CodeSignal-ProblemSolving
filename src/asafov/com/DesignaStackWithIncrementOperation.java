package asafov.com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DesignaStackWithIncrementOperation {


    public static void main(String[] args) {
        LinkedList<Integer> stack=new LinkedList<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        System.out.println(stack);
        ListIterator<Integer> iter = stack.listIterator(0);
        while (iter.hasNext()){
            iter.set(5+iter.next());
        }
        System.out.println(stack);
    }
}
class CustomStack {
    private int size=0;
    private int maxSize;
    private LinkedList<Integer> stack;
    public CustomStack(int maxSize) {
        this.maxSize=maxSize;
        this.stack = new LinkedList<>();
    }

    public void push(int x) {
        if (size<maxSize){
            stack.add(0,x);
            size++;
        }
    }

    public int pop() {
        if (size<1){
            return -1;
        }
        size--;
        return stack.removeFirst();
    }

    public void increment(int k, int val) {
        int index = 0;
        if (k<size){
            index = size-k;
        }
        ListIterator<Integer> iter = stack.listIterator(index);
        while (iter.hasNext()){
            iter.set(val+iter.next());
        }
    }
}