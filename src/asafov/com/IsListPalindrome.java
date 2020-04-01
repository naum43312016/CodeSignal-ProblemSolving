package asafov.com;

public class IsListPalindrome {

    static boolean isListPalindrome(ListNode<Integer> l) {
        if (l==null) return true;
        if (l.next==null) return true;
        ListNode<Integer> slow = l;
        ListNode<Integer> fast = l;
        ListNode<Integer> temp = l;
        int len=0;
        while (temp!=null){
            len++;
            temp=temp.next;
        }
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        if (len%2!=0) slow=slow.next;
        slow = reverse(slow);

        while (slow!=null){
            if (l.value.compareTo(slow.value)!=0) return false;
            l=l.next;
            slow=slow.next;
        }
        return true;
    }

    static ListNode<Integer> reverse(ListNode<Integer> second_half)
    {
        ListNode<Integer> prev = null;
        ListNode<Integer> current = second_half;
        ListNode<Integer> next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode<Integer> list = new ListNode<>(1);
        list.next = new ListNode<>(1000000000);
        list.next.next = new ListNode<>(-1000000000);
        list.next.next.next = new ListNode<>(-1000000000);
        list.next.next.next.next = new ListNode<>(1000000000);
        list.next.next.next.next.next = new ListNode<>(1);
        System.out.println(isListPalindrome(list));
    }


}
