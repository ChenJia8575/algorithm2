package leetcode.s1linkedList;

public class ListNode<T> implements Comparable<ListNode> {
    public T val;
    public ListNode next;

    public ListNode(T val ,ListNode next) {
        this.val=val;
        this.next=next;
    }
    public ListNode(T val) {
        this.val=val;
        this.next=null;
    }
    public ListNode(T ...args) {
        ListNode<T> n1=new ListNode<T>(args[args.length-1]);
        ListNode<T> temp=n1;
        for(int i=args.length-2;i>=0;i--){
            ListNode<T> now=new ListNode<T>(args[i],temp);
            temp=now;
        }
        this.val=temp.val;
        this.next=temp.next;
    }
    @Override
    public String toString() {
        ListNode p=this;
        String str=this.val+"";
        while (p.next!=null){
            str+="->"+p.next.val;
            p=p.next;
        }
        return str;
    }


    public static void main(String[] args) {
        ListNode p1=new ListNode(4);
        ListNode p2=new ListNode(2,p1);
        ListNode p3=new ListNode(1,p2);
        System.out.println(p3);

        System.out.println(new ListNode(4,8,2,7));
    }

    @Override
    public int compareTo(ListNode o) {
        return String.valueOf(this.val).compareTo(String.valueOf(o.val));
    }
}
