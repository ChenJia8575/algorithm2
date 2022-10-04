package leetcode.s1linkedList;

public class S4FindFromEnd {
    public static void main(String[] args) {
        ListNode head=new ListNode(5,2,8,3,7,4,6);
        ListNode k=new S4FindFromEnd().findFromEnd(head,3);
        System.out.println(k.val);
    }
    // 返回链表的倒数第 k 个节点
    public static ListNode findFromEnd(ListNode head, int k) {
        ListNode p1 =head;
        for(int i=0;i<k;i++){
            p1=p1.next;
        }
        ListNode p2=head;
        while(p1!=null){
            p2=p2.next;
            p1=p1.next;
        }
        return p2;
    }
}
