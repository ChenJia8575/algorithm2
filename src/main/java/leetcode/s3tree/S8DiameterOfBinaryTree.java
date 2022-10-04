package leetcode.s3tree;

import static leetcode.s3tree.S4PreorderTraverse.tree2;

public class S8DiameterOfBinaryTree {

    public int maxDiameter=0;

    public static void main(String[] args) {
        S8DiameterOfBinaryTree obj=new S8DiameterOfBinaryTree();
        obj.traverse(tree2());
        System.out.println(obj.maxDiameter);
    }
    public void traverse(TreeNode root){
        if(root==null)return ;
        int leftmax = maxDepth(root.left);
        int rightmax = maxDepth(root.right);
        int mydiameter=leftmax+rightmax;
        maxDiameter=Math.max(maxDiameter,mydiameter);
        traverse(root.left);
        traverse(root.right);
    }

    public int maxDepth(TreeNode root){
        if(root==null)return 0;
        int leftmax = maxDepth(root.left);
        int rightmax = maxDepth(root.right);
        return Math.max(leftmax,rightmax)+1;
    }
}
