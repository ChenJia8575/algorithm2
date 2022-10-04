package leetcode.s3tree;

import leetcode.s1linkedList.ListNode;

public class S1 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,6,3,8};
        traverse(arr);
        traverse(arr,0);
        System.out.println("-------------");
        traverse(new ListNode(3,6,3,8));
        traverse2(new ListNode(3,6,3,8));
    }
    public static void traverse(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void traverse(int[] arr,int i){
        if(i==arr.length)return;
        System.out.println(arr[i]);
        traverse(arr,i+1);
    }

    public static void traverse(ListNode head){
        for(ListNode p =head;p!=null;p=p.next){
            System.out.println(p.val);
        }
    }
    public static void traverse2(ListNode head){
        if(head==null)return;
        System.out.println(head.val);
        traverse2(head.next);

    }

}
