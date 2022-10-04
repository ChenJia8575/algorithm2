package leetcode.s3tree;

import java.util.LinkedList;
import java.util.List;

import static leetcode.s3tree.S4PreorderTraverse.tree2;

public class S5PreorderTraverse {
    public static void main(String[] args) {
        List<Integer> res = new S5PreorderTraverse().preorderTraverse(tree2());
        for(Integer x:res) System.out.println(x);
    }
    List<Integer> preorderTraverse(TreeNode root){
        LinkedList<Integer> res = new LinkedList<>();
        if(root==null) return res;
        res.add(root.value);
        res.addAll(preorderTraverse(root.left));
        res.addAll(preorderTraverse(root.right));
        return res;
    }
}
