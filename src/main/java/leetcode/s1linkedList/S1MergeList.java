package leetcode.s1linkedList;

/*
合并两个有序链表
 */
class S1MergeList {
    public static void main(String[] args) {
        ListNode<Integer> p1=new ListNode(4);
        ListNode<Integer> p2=new ListNode(2,p1);
        ListNode<Integer> p3=new ListNode(1,p2);

        ListNode<Integer> pa=new ListNode(4);
        ListNode<Integer> pb=new ListNode(3,pa);
        ListNode<Integer> pc=new ListNode(1,pb);
        ListNode<Integer> ret=new S1MergeList().mergeTwoLists(p3,pc);
        System.out.println(ret);
    }
    public ListNode mergeTwoLists(ListNode<Integer> list1, ListNode<Integer> list2) {
        ListNode<Integer> dummy=new ListNode(-1);
        ListNode<Integer> p= dummy;
        ListNode<Integer> p1=list1, p2=list2;

        while(p1!=null && p2!=null){
            if(p1.val>p2.val){
                p.next=p2;
                p2=p2.next;
            }else{
                p.next=p1;
                p1=p1.next;
            }
            p=p.next;
        }
        if(p1!=null){
            p.next=p1;
        }
        if(p2!=null){
            p.next=p2;
        }
        return dummy.next;
    }
}