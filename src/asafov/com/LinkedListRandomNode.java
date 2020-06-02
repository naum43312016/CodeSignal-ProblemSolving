package asafov.com;

import java.util.List;
import java.util.Random;

public class LinkedListRandomNode {


    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
    }

    static class Solution {
        private int len=0;
        private ListNode head;
        /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
        public Solution(ListNode head) {
            this.head=head;
            ListNode t = head;
            while (t!=null){
                this.len++;
                t=t.next;
            }
        }

        /** Returns a random node's value. */
        public int getRandom() {
            int n = new Random().nextInt(len);
            ListNode t = head;
            int i=0;
            while (i<n){
                t=t.next;
                i++;
            }
            return t.val;
        }
    }
}


