package leetcode.s4backtrack;

import leetcode.Util;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class S7permuteUnique排列元素可重不可复选 {
    public static void main(String[] args) {
        S7permuteUnique排列元素可重不可复选 obj = new S7permuteUnique排列元素可重不可复选();
        List<List<Integer>> ret = obj.permuteUnique(new int[]{1, 2, 2});
        Util.printListListT(ret);
    }
    List<List<Integer>> res=new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();
    List<List<Integer>> permuteUnique(int[] nums){
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrack(nums,used);
        return res;
    }
    public void backtrack(int[] nums,boolean[] used){
        System.out.println("进来"+ Util.listT2Str(track)+" "+ Util.arrayBoolean2Str(used));
        if(track.size()==nums.length){
            res.add(new LinkedList<>(track));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            // 新添加的剪枝逻辑，固定相同的元素在排列中的相对位置
            if(i>0 && nums[i]==nums[i-1]&&!used[i-1]){
                continue;
            }
            track.add(nums[i]);
            used[i]=true;
            backtrack(nums,used);
            track.removeLast();
            used[i]=false;
        }
    }
}
