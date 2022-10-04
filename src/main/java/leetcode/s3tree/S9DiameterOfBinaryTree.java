package leetcode.s3tree;

import static leetcode.s3tree.S4PreorderTraverse.tree2;

public class S9DiameterOfBinaryTree {
    int maxDiameter=0;

    public static void main(String[] args) {
        S9DiameterOfBinaryTree obj = new S9DiameterOfBinaryTree();
        obj.maxDepth(tree2());
        System.out.println(obj.maxDiameter);
    }
    int maxDepth(TreeNode root){
        if(root==null)return 0;
        int leftmax = maxDepth(root.left);
        int rightmax = maxDepth(root.right);
        int myDiameter=leftmax+rightmax;
        maxDiameter=Math.max(maxDiameter,myDiameter);
        return Math.max(leftmax,rightmax)+1;
    }
}
