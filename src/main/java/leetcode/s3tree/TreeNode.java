package leetcode.s3tree;

import java.util.Deque;
import java.util.LinkedList;

public class TreeNode {
    int value;
    //数据
    TreeNode left;
    // 指向左子树
    TreeNode right;//指向右子树

    public TreeNode() {
    }

    public TreeNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }
    public TreeNode(int value,TreeNode left,TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public TreeNode create(char[] arr, int index) {
        if (index >= arr.length) {
            return null;
        } else {
            TreeNode tmpNode = new TreeNode((int) (arr[index]));
            tmpNode.left = create(arr, 2 * index);
            tmpNode.right = create(arr, 2 * index + 1);
            return tmpNode;
        }
    }
    public static TreeNode processTreeNode(Integer[] array) {
        if (array.length == 0) {
            return null;
        }
        TreeNode treeNode = new TreeNode(array[0]);
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(treeNode);
        // 先左后右
        boolean isleft = true;
        for (int i = 1; i < array.length; i++) {
            TreeNode peek = deque.getFirst();
            if (isleft) {
                if (array[i] != null) {
                    peek.left = new TreeNode(array[i]);
                    //将左节点添加至队尾
                    deque.offer(peek.left);
                }
                isleft = false;

            } else {
                if (array[i] != null) {
                    peek.right = new TreeNode(array[i]);
                    deque.offer(peek.right);
                }
                // 删除队头第一个元素
                deque.pollFirst();
                isleft = true;
            }
        }
        return treeNode;
    }
}