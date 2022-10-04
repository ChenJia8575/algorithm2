package leetcode.s1linkedList;

public class S8GetIntersectionNode {
    public static void main(String[] args) {
        ListNode<String> c2=new ListNode<>("c2");
        ListNode<String> c1=new ListNode<>("c1",c2);
        ListNode<String> a2=new ListNode<>("a2",c1);
        ListNode<String> a1=new ListNode<>("a1",a2);

        ListNode<String> b3=new ListNode<>("b3",c1);
        ListNode<String> b2=new ListNode<>("b2",b3);
        ListNode<String> b1=new ListNode<>("b1",b2);

        System.out.println(a1);
        System.out.println(b1);

        ListNode ret = getIntersectionNode(a1, b1);
        System.out.println(ret);
    }
    public static ListNode getIntersectionNode(ListNode headA,ListNode headB){
        ListNode p1=headA;
        ListNode p2=headB;
        while(p1!=p2){
            if(p1==null)p1=headB;
            else p1=p1.next;
            if(p2==null)p2=headA;
            else p2=p2.next;
        }
        return p1;
    }
}
