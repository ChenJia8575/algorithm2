package leetcode.s4backtrack;

import leetcode.Util;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class S6combinationSum2 {
    public static void main(String[] args) {
        List<List<Integer>> res = new S6combinationSum2().combinationSum2(new int[]{1, 2,2, 3},5);
        Util.printListListT(res);
    }
    List<List<Integer>> res=new LinkedList<>();
    LinkedList<Integer> track=new LinkedList<>();
    // 记录 track 中的元素之和
    int trackSum = 0;
    public List<List<Integer>> combinationSum2(int[] candidates,int target){
        if(candidates.length==0)return res;
        // 先排序，让相同的元素靠在一起
        Arrays.sort(candidates);
        backtrack(candidates,0,target);
        return res;
    }
    public void backtrack(int[] nums,int start,int target) {
        if(trackSum==target){
            res.add(new LinkedList<>(track));
            return;
        }
        if(trackSum>target)return;

        for(int i=start;i<nums.length;i++){
            if(i>start &&nums[i]==nums[i-1]){
                continue;
            }
            track.addLast(nums[i]);
            trackSum+=nums[i];
            backtrack(nums,i+1,target);
            track.removeLast();
            trackSum-=nums[i];
        }
    }
}
