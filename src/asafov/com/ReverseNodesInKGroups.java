package asafov.com;

import java.util.LinkedList;
import java.util.List;

public class ReverseNodesInKGroups {

    ListNode<Integer> reverseNodesInKGroups(ListNode<Integer> head, int k) {
        ListNode<Integer> dummy = new ListNode<>(-1);
        dummy.next = head;
        ListNode<Integer> begin = dummy;
        int count = 0;
        while(head != null){
            count++;
            if(count % k == 0){
                begin = reverseNode(begin, head.next);
                head = begin.next;
            }else{
                head = head.next;
            }
        }
        return dummy.next;
    }

    private ListNode<Integer> reverseNode(ListNode<Integer> begin, ListNode<Integer> end){
        ListNode<Integer> prev = begin;
        ListNode<Integer> curr = begin.next;
        ListNode<Integer> first = curr;
        while(curr != end){
            ListNode<Integer> next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        begin.next = prev;
        first.next = curr;
        return first;
    }

}
