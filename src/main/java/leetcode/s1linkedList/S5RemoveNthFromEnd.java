package leetcode.s1linkedList;

public class S5RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, 2, 3, 4, 5);
        ListNode ret = removeNthFromEnd(head, 2);
        System.out.println(ret);
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode x = S4FindFromEnd.findFromEnd(dummy, n + 1);
        x.next=x.next.next;
        return dummy.next;
    }
}
