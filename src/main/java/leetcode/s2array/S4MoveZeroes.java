package leetcode.s2array;

import leetcode.Util;

import java.util.Arrays;

public class S4MoveZeroes {
    public static void main(String[] args) {
        int[] ret =moveZeroes(new int[]{0,1,4,0,2});
        Util.printIntArray(ret);
    }
    public static int[] moveZeroes(int[] nums){
        int p = S3RemoveElement.removeElement(nums,0);
        Util.printIntArray(nums);
        for(;p<nums.length;p++){
            nums[p]=0;
        }
        return nums;
    }
}
