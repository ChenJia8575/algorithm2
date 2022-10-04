package leetcode.s3tree;

import static leetcode.s3tree.S4PreorderTraverse.tree2;

public class S7Count {
    public static void main(String[] args) {
        int count = new S7Count().count(tree2());
        System.out.println(count);
    }
    public int count(TreeNode root){
        if(root==null) return 0;
        int lcount=count(root.left);
        int rcount=count(root.right);
        System.out.println("节点"+root.value+"的左子树有 "+lcount+"，右子树有"+rcount);
        return lcount+rcount+1;
    }
}
