package asafov.com;

public class MergeTwoLinkedLists {

    ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode<Integer> res = null;
        ListNode<Integer> temp = null;
        while (l1!=null && l2!=null){
            if (l1.value<=l2.value){
                if (res==null){
                    temp = new ListNode<>(l1.value);
                    res = temp;
                    l1=l1.next;
                }else {
                    temp.next = new ListNode<>(l1.value);
                    l1=l1.next;
                    temp=temp.next;
                }
            }else{
                if (res==null){
                    temp = new ListNode<>(l2.value);
                    res = temp;
                    l2=l2.next;
                }else {
                    temp.next = new ListNode<>(l2.value);
                    l2=l2.next;
                    temp=temp.next;
                }
            }
        }
        while (l1!=null){
            if (res==null){
                temp = new ListNode<>(l1.value);
                res = temp;
                l1=l1.next;
            }else {
                temp.next = new ListNode<>(l1.value);
                l1=l1.next;
                temp=temp.next;
            }
        }
        while (l2!=null){
            if (res==null){
                temp = new ListNode<>(l2.value);
                res = temp;
                l2=l2.next;
            }else {
                temp.next = new ListNode<>(l2.value);
                l2=l2.next;
                temp=temp.next;
            }
        }
        return res;
    }


    public static void main(String[] args) {

    }
}
