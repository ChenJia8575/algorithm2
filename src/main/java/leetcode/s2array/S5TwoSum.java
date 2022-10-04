package leetcode.s2array;

import leetcode.Util;

public class S5TwoSum {
    public static void main(String[] args) {
        int[] ret = twoSum(new int[]{2, 7, 11, 15}, 16);
        Util.printIntArray(ret);
    }
    public static int[] twoSum(int[] nums,int target){
        int left=0,right=nums.length-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            }else if(sum<target){
                left++;
            } else if (sum>target) {
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}
