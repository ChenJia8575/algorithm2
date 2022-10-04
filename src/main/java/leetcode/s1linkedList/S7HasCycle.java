package leetcode.s1linkedList;

public class S7HasCycle {
    public static void main(String[] args) {
        //5->6->7->8->9->10->闭环到7
        ListNode p10=new ListNode(10);
        ListNode p9=new ListNode(9,p10);
        ListNode p8=new ListNode(8,p9);
        ListNode p7=new ListNode(7,p8);
        ListNode p6=new ListNode(6,p7);
        ListNode head=new ListNode(5,p6);
        p10.next=p7;

        boolean ret = hasCycle(head);
        System.out.println(ret);
    }
    public static boolean hasCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
