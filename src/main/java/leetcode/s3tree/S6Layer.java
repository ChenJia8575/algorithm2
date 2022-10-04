package leetcode.s3tree;

import static leetcode.s3tree.S4PreorderTraverse.tree2;

public class S6Layer {
    public static void main(String[] args) {
        new S6Layer().traverse(tree2(),1);
    }
    public void traverse(TreeNode root,int level){
        if(root==null)return;
        System.out.println(root.value+" "+level);
        traverse(root.left, level+1);
        traverse(root.right,level+1);
    }
}
