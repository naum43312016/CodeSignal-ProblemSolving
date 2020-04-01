package asafov.com;

import java.util.LinkedList;
import java.util.List;

/*
You've created a new programming language,
and now you've decided to add hashmap
support to it. Actually you are quite
disappointed that in common programming
languages it's impossible to add a number
to all hashmap keys, or all its values.
So you've decided to take matters into your own hands and implement your own hashmap
in your new language that has the following operations:
 */
public class hashMap {

     long hashMap(String[] queryType, int[][] query) {
        if (query==null || queryType==null) return 0;
        MyMap map = new MyMap();
        for (int i=0;i<queryType.length;i++){
            int[] q = query[i];
            if (queryType[i].equals("insert")){
                map.put(q[0],q[1]);
            }else if (queryType[i].equals("addToValue")){
                map.addToValue(q[0]);
            }else if (queryType[i].equals("addToKey")){
                map.addToKey(q[0]);
            }else {
                return map.get(q[0]);
            }
        }
        return 0;
    }

}

class MyMap {
    private Node[] table;
    private int size;
    private static int INITIAL_CAPACITY = 16;
    private static int MAX_SIZE = 1 << 30;

    public MyMap() {
        this.size = 0;
        this.table = new Node[INITIAL_CAPACITY];
    }

    /*public void print(){
        for (int i=0;i<table.length;i++){
            if (table[i]!=null){
                System.out.println(table[i].key + " value="+table[i].val + " hash" + table[i].hash);
            }
        }
    }*/
    private class Node{
        long hash;
        long key;
        long val;
        Node next;

        public Node(long key, long val,long hash) {
            this.hash = hash;
            this.key = key;
            this.val = val;
        }
    }
    public void addToValue(int n){
        for (int i=0;i<table.length;i++){
            if (table[i]!=null){
                Node node = table[i];
                while (node!=null){
                    node.val=node.val+n;
                    node=node.next;
                }
            }
        }
    }
    public void addToKey(int n){
        for (int i=0;i<table.length;i++){
            if (table[i]!=null){
                Node node = table[i];
                while (node!=null){
                    node.hash=node.hash+n;
                    node.key=node.key+n;
                    node=node.next;
                }
            }
        }
    }
    public void put(long key,long val){
        int hash = getHash(key);
        int cell = getCell(hash);
        Node n = new Node(key,val,hash);
        Node node = table[cell];
        if (node==null){
            table[cell] = n;
            size++;
            return;
        }
        while (node.next!=null){
            if (node.key==n.key)
            {
                node.val = n.val;
                return;
            }
            node = node.next;
        }
        if (node.key==n.key)
        {
            node.val = n.val;
            size++;
            return;
        }
        node.next = n;
        size++;
    }
    public long get(long key){//TODO change to something normal
        for (int i=0;i<table.length;i++){
            if (table[i]!=null){
                Node node = table[i];
                while (node!=null){
                    if (node.key==key) return node.val;
                    node=node.next;
                }
            }
        }
        return 0;
    }



    private int getHash(long key){
        return Math.abs(((Long)key).hashCode());
    }
    private int getCell(int hash){
        return hash % table.length;
    }
    public boolean isEmpty(){
        return this.size==0;
    }
    public int size(){
        return this.size;
    }
}

