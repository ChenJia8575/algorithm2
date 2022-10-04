package leetcode.s3tree;

import java.util.LinkedList;
import java.util.List;

public class S4PreorderTraverse {
    public static TreeNode tree1(){
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode e = new TreeNode(4,f,g);
        TreeNode d = new TreeNode(5);
        TreeNode b = new TreeNode(2,d,e);

        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);
        TreeNode c = new TreeNode(3,h,i);

        TreeNode a = new TreeNode(1,b,c);
        return a;
    }

    public static TreeNode tree2(){
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(4);
        TreeNode b = new TreeNode(2,d,e);
        TreeNode g = new TreeNode(7);
        TreeNode f = new TreeNode(6,g,null);

        TreeNode c = new TreeNode(5,f,null);
        TreeNode a = new TreeNode(1,b,c);
        return a;
    }

    public static void main(String[] args) {

        //List<Integer> ret = new S4PreorderTraverse().preorderTraverse(tree1());
        List<Integer> ret = new S4PreorderTraverse().preorderTraverse(tree2());
        for(Integer x:ret) System.out.println(x);
    }
    List<Integer> res=new LinkedList<>();
    List<Integer> preorderTraverse(TreeNode root){
        traverse(root);
        return res;
    }
    public void traverse(TreeNode root){
        if(root==null) return ;
        res.add(root.value);
        traverse(root.left);
        traverse(root.right);
    }
}
