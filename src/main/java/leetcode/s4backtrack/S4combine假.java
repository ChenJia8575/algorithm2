package leetcode.s4backtrack;

import leetcode.Util;

import java.util.LinkedList;
import java.util.List;

public class S4combine假 {
    public static void main(String[] args) {
        List<List<Integer>> res = new S4combine假().combine(new int[]{1, 2, 3},2);
        Util.printListListT(res);
    }
    List<List<Integer>> res=new LinkedList<>();
    LinkedList<Integer> track=new LinkedList<>();
    public List<List<Integer>> combine(int[] nums,int k){
        backtrack(nums,k);
        return res;
    }
    public void backtrack(int[] nums,int k) {
        if(k==track.size()){
            res.add(new LinkedList<>(track));
            return;
        }
        for(int i=k;i<nums.length;i++){
            track.addLast(nums[i]);
            backtrack(nums,k);
            track.removeLast();
        }
    }
}
