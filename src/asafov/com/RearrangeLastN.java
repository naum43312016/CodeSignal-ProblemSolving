package asafov.com;

public class RearrangeLastN {

    static ListNode<Integer> rearrangeLastN(ListNode<Integer> l, int n) {
        if (n==0) return l;
        ListNode<Integer> list = l;
        ListNode<Integer> first=l;
        ListNode<Integer> last=l;
        int i=0;
        while (i<n){
            if (last==null) return l;
            last=last.next;
            i++;
        }
        if (last==null) return l;
        while (last.next!=null){
            last= last.next;
            first=first.next;
        }
        last.next = list;
        list = first.next;
        first.next = null;

        return list;
    }

    public static void main(String[] args) {
        ListNode<Integer> l = new ListNode<>(1);
        l.next = new ListNode<>(2);
        l.next.next = new ListNode<>(3);
        l.next.next.next = new ListNode<>(4);
        l.next.next.next.next = new ListNode<>(5);
        l=rearrangeLastN(l,3);
        while (l!=null){
            System.out.println(l.value);
            l=l.next;
        }
    }
}
