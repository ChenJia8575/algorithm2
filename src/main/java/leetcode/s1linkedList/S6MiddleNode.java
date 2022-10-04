package leetcode.s1linkedList;

public class S6MiddleNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(4, 6, 3, 7, 3, 7, 4);
        ListNode mid = middleNode(head);
        System.out.println(mid);
    }
    public static ListNode middleNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
