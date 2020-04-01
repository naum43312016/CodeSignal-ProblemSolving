package asafov.com;

public class RemoveKFromList {


    ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
        if (l==null) return null;
        ListNode<Integer> prev = null;
        ListNode<Integer> node = l;
        while (node!=null){
            if (node.value==k){
                if (prev==null){
                    l=l.next;
                }else{
                    prev.next = node.next;
                }
            }else{
                prev = node;
            }
            node = node.next;
        }
        return l;
    }


}
