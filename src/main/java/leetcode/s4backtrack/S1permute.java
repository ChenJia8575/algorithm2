package leetcode.s4backtrack;

import leetcode.Util;

import java.util.LinkedList;
import java.util.List;

public class S1permute {
    public static void main(String[] args) {
        List<List<Integer>> res = new S1permute().permute(new int[]{1, 2, 3});
        Util.printListListT(res);
    }
    List<List<Integer>> res=new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();
    List<List<Integer>> permute(int[] nums){
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
            track.add(nums[i]);
            used[i]=true;
            backtrack(nums,used);
            track.removeLast();
            used[i]=false;
        }
    }
}
