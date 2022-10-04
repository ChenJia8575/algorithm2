package leetcode.s4backtrack;

import leetcode.Util;

import java.util.LinkedList;
import java.util.List;

public class S2subsets {
    public static void main(String[] args) {
        List<List<Integer>> res = new S2subsets().subsets(new int[]{1, 2, 3});
        Util.printListListT(res);
    }
    List<List<Integer>> res=new LinkedList<>();
    LinkedList<Integer> track=new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums){
        backtrack(nums,0);
        return res;
    }
    public void backtrack(int[] nums,int start) {
        res.add(new LinkedList<>(track));
        for(int i=start;i<nums.length;i++){
            track.addLast(nums[i]);
            backtrack(nums,i+1);
            track.removeLast();
        }

    }




}
