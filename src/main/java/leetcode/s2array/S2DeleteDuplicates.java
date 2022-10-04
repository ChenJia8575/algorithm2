package leetcode.s2array;
import leetcode.s1linkedList.ListNode;

public class S2DeleteDuplicates {
    public static void main(String[] args) {
        ListNode ret = deleteDuplicates(new ListNode<>(0, 1, 1, 2, 2, 3, 3));
        System.out.println(ret);
    }
    public static ListNode deleteDuplicates(ListNode<Integer> head){
        if(head==null) return null;
        ListNode<Integer> slow=head,fast=head;
        while(fast!=null){
            if(fast.val!=slow.val){
                slow.next=fast;
                slow=slow.next;
            }
            fast=fast.next;
        }
        slow.next=null;
        return head;
    }
}
