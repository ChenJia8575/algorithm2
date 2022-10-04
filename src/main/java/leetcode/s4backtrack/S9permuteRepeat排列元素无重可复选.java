package leetcode.s4backtrack;

import leetcode.Util;

import java.util.LinkedList;
import java.util.List;

public class S9permuteRepeat排列元素无重可复选 {
    public static void main(String[] args) {
        S9permuteRepeat排列元素无重可复选 obj=new S9permuteRepeat排列元素无重可复选();
        List<List<Integer>> res = obj.permuteRepeat(new int[]{1, 2, 3});
        Util.printListListT(res);
    }
    List<List<Integer>> res=new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();
    List<List<Integer>> permuteRepeat(int[] nums){
        backtrack(nums);
        return res;
    }
    public void backtrack(int[] nums){
        System.out.println("进来"+ Util.listT2Str(track)+" ");
        if(track.size()==nums.length){
            // 收集叶子节点上的值
            res.add(new LinkedList<>(track));
            return;
        }
        for(int i=0;i<nums.length;i++){
            track.add(nums[i]);
            backtrack(nums);
            track.removeLast();
        }
    }
}
