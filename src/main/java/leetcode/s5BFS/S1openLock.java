package leetcode.s5BFS;

import leetcode.s3tree.TreeNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

import static leetcode.s3tree.S4PreorderTraverse.tree2;

/**
 * 广度优先BFS
 */
public class S1openLock {
    public static void main(String[] args) {
        int res=new S1openLock().openLock(new String[]{"0201","0101","0102","1212","2002"},"0202");
        //int res=new S1openLock().openLock(new String[]{"8888"},"0009");
        System.out.println(res);

    }
    // 将 s[j] 向上拨动一次
    String plusOne(String s, int j) {
        char[] ch = s.toCharArray();
        if (ch[j] == '9')
            ch[j] = '0';
        else
            ch[j] += 1;
        return new String(ch);
    }
    // 将 s[i] 向下拨动一次
    String minusOne(String s, int j) {
        char[] ch = s.toCharArray();
        if (ch[j] == '0')
            ch[j] = '9';
        else
            ch[j] -= 1;
        return new String(ch);
    }
    // 输入一棵二叉树的根节点，层序遍历这棵二叉树
    int openLock(String[] deadends,String target) {
        HashSet<String> deads = new HashSet<>();
        for(String s:deadends) deads.add(s);
        HashSet<Object> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        int step=0;
        q.offer("0000");
        visited.add("0000");


        // 从上到下遍历二叉树的每一层
        while (!q.isEmpty()) {
            int sz = q.size();
            // 从左到右遍历每一层的每个节点
            for (int i = 0; i < sz; i++) {
                String cur = q.poll();
                if(deads.contains(cur))continue;
                if(cur.equals(target))return step;
                // 将下一层节点放入队列
                for(int j=0;j<4;j++){
                    String up = plusOne(cur, j);
                    if(!visited.contains(up)){
                        q.offer(up);
                        visited.add(up);
                    }
                    String down = minusOne(cur, j);
                    if(!visited.contains(down)){
                        q.offer(down);
                        visited.add(down);
                    }
                }
            }
            step++;
        }
        return -1;
    }
}
