package leetcode.s1linkedList;

public class S2SplitList {
    public static void main(String[] args) {
        ListNode head=new ListNode(1,4,3,2,5,2);
        ListNode ret=new S2SplitList().partition(head,3);
        System.out.println(ret);
    }
    public ListNode partition(ListNode head,int x){
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode p1=dummy1;
        ListNode p2=dummy2;

        ListNode<Integer> p = head;
        int i=1;
        while (p!=null){
            System.out.println("i="+i);
            if(p.val>=x){
                p2.next=p;
                p2 = p2.next;
            }else {
                p1.next=p;
                p1=p1.next;
            }
            System.out.println("p1="+p1);
            System.out.println("p2="+p2);
            ListNode temp = p.next;
            System.out.println("temp="+temp);
            p.next=null;
            System.out.println("p="+p);
            p=temp;
            System.out.println("p="+p);
            i++;
        }
        System.out.println("dummy1="+dummy1);
        System.out.println("p1="+p1);
        System.out.println("dummy2="+dummy2);
        p1.next=dummy2.next;
        return dummy1.next;
    }
}
