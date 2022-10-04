package leetcode.s3tree;

public class S3MaxDepth {
    public static void main(String[] args) {
        TreeNode root= TreeNode.processTreeNode(new Integer[]{1,7,8,3,5,null,null});
        System.out.println(maxDepth(root));
    }
    public static int maxDepth(TreeNode root){
        if(root==null) return 0;
        int leftMax=maxDepth(root.left);
        int rightMax=maxDepth(root.right);
        int res=Math.max(leftMax,rightMax)+1;
        return res;
    }
}
