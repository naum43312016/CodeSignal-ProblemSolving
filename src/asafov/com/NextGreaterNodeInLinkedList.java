package asafov.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NextGreaterNodeInLinkedList {


    static public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }


    public int[] nextLargerNodes(ListNode head) {
        if (head==null) return new int[]{0};
        List<Integer> list = new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head=head.next;
        }

        int[] arr = new int[list.size()];
        for (int i=0;i<arr.length-1;i++){
            int val = list.get(i);
            for (int j=i+1;j<arr.length;j++){
                if (list.get(j)>val){
                    arr[i]=list.get(j);
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(2);
        l.next=new ListNode(1);
        l.next.next=new ListNode(5);
        int[] ans = new NextGreaterNodeInLinkedList().nextLargerNodes(l);
        System.out.println(Arrays.toString(ans));

    }
}
