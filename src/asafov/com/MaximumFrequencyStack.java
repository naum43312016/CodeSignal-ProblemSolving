package asafov.com;

import java.util.*;

public class MaximumFrequencyStack {


    public static void main(String[] args) {
        FreqStack s = new FreqStack();
        s.push(5);
        s.push(7);
        s.push(5);
        s.push(7);
        s.push(4);
        s.push(5);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
class FreqStack {
    static class Val{
        int val;
        int indx;

        public Val(int val,int indx) {
            this.val = val;
            this.indx = indx;
        }

        @Override
        public String toString() {
            return "Val{" +
                    "val=" + val +
                    ", indx=" + indx +
                    '}';
        }
    }
    int size=0;
    ArrayDeque<Integer> list;
    Map<Integer,LinkedList<Val>> map;
    public FreqStack() {
        list=new ArrayDeque<>();
        map = new HashMap<>();
    }

    public void push(int x) {
        list.addFirst(x);
        if (map.containsKey(x)){
            LinkedList<Val> l = map.get(x);
            l.addLast(new Val(x,size++));
            map.put(x,l);
        }else{
            LinkedList<Val> l =new LinkedList<>();
            l.addFirst(new Val(x,size++));
            map.put(x,l);
        }

    }

    public int pop() {
        int maxVal=-1;
        int freq=-1;
        int lastIndx=-1;
        for (Map.Entry<Integer,LinkedList<Val>> entry : map.entrySet()){
            int s = entry.getValue().size();
                if (s>=freq){
                    Val v = entry.getValue().getLast();
                    if (freq==s){
                        if (v.indx>lastIndx){
                            lastIndx=v.indx;
                            maxVal=v.val;
                        }
                    }else{
                        freq=s;
                        lastIndx=v.indx;
                        maxVal=v.val;
                    }
                }
        }
        if (freq!=-1){
            LinkedList<Val> l = map.get(maxVal);
            l.removeLast();
            if (l.isEmpty()){
                map.remove(maxVal);
            }else{
                map.put(maxVal,l);
            }
            list.removeFirstOccurrence(maxVal);
            return maxVal;
        }else {
            return -1;
        }
    }
}