package leetcode.s4backtrack;

import leetcode.Util;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class S8combinationSum子集or组合元素无重可复选 {
    public static void main(String[] args) {
        S8combinationSum子集or组合元素无重可复选 obj=new S8combinationSum子集or组合元素无重可复选();
        List<List<Integer>> res = obj.combinationSum2(new int[]{1, 2, 3},3);
        Util.printListListT(res);
    }
    List<List<Integer>> res=new LinkedList<>();
    LinkedList<Integer> track=new LinkedList<>();
    // 记录 track 中的元素之和
    int trackSum = 0;
    public List<List<Integer>> combinationSum2(int[] candidates,int target){
        if(candidates.length==0)return res;
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
            // 选择 nums[i]
            trackSum += nums[i];
            track.add(nums[i]);
            // 递归遍历下一层回溯树
            // 同一元素可重复使用，注意参数i，而不再是i+1
            backtrack(nums, i, target);
            // 撤销选择 nums[i]
            trackSum -= nums[i];
            track.removeLast();
        }
    }
}
