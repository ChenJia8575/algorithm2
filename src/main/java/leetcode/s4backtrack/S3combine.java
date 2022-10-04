package leetcode.s4backtrack;

import leetcode.Util;

import java.util.LinkedList;
import java.util.List;

public class S3combine {
    public static void main(String[] args) {
        List<List<Integer>> res = new S3combine().combine(3,2);
        Util.printListListT(res);
    }
    List<List<Integer>> res=new LinkedList<>();
    LinkedList<Integer> track=new LinkedList<>();
    public List<List<Integer>> combine(int n,int k){
        backtrack(1,n,k);
        return res;
    }
    public void backtrack(int start,int n,int k) {
        if(k==track.size()){
            res.add(new LinkedList<>(track));
            return;
        }
        for(int i=start;i<=n;i++){
            track.addLast(i);
            backtrack(i+1,n,k);
            track.removeLast();
        }
    }
}
