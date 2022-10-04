package leetcode.s2array;

import leetcode.Util;

public class S3RemoveElement {
    public static void main(String[] args) {
        int[] arr =new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int l = removeElement(arr, 2);
        Util.printIntArray(arr);
        System.out.println(l);

    }
    public static int removeElement(int[] nums, int val){
        int fast=0,slow=0;
        while(fast<nums.length){
            if(nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
