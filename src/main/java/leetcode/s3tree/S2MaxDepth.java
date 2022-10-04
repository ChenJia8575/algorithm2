package leetcode.s3tree;

public class S2MaxDepth {
    public static void main(String[] args) {
        TreeNode root= TreeNode.processTreeNode(new Integer[]{1,7,8,3,5,null,null});
        int ret = new S2MaxDepth().maxDepth(root);
        System.out.println(ret);
    }
    int res=0;
    int depth=0;
    public int maxDepth(TreeNode root){
        traverse(root);
        return res;
    };

    public void traverse(TreeNode root){
        if(root==null){
            return ;
        }
        depth++;
        if(root.left==null && root.right==null){
            res=Math.max(res,depth);
        }
        traverse(root.left);
        traverse(root.right);
        depth--;
    }
}
