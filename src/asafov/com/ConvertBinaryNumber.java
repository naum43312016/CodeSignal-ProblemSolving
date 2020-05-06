package asafov.com;

public class ConvertBinaryNumber {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public int getDecimalValue(ListNode head) {
        StringBuilder str = new StringBuilder();
        if (head==null) return 0;
        while(head!=null) {
            str.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(str.toString(),2);
    }

}

