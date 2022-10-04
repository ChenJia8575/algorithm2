package leetcode.s3tree;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

import static leetcode.s3tree.S4PreorderTraverse.tree2;

/**
 * 就是广度优先BFS
 */
public class S10levelTraverse {
    public static void main(String[] args) {
        TreeNode root=tree2();
        new S10levelTraverse().levelTraverse(root);

    }

    // 输入一棵二叉树的根节点，层序遍历这棵二叉树
    void levelTraverse(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        System.out.println(root.value);
        q.offer(root);

        // 从上到下遍历二叉树的每一层
        while (!q.isEmpty()) {
            System.out.println("q中有");
            for (Object node:q.toArray()){
                System.out.print(((TreeNode)node).value+" ");
            }
            System.out.println();
            int sz = q.size();
            // 从左到右遍历每一层的每个节点
            for (int i = 0; i < sz; i++) {
                TreeNode cur = q.poll();
                System.out.println("进入每一层");
                // 将下一层节点放入队列
                if (cur.left != null) {
                    System.out.println(cur.left.value);
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    System.out.println(cur.right.value);
                    q.offer(cur.right);
                }
            }
        }
    }
}
