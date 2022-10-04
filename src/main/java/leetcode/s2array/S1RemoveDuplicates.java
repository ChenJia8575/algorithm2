package leetcode.s2array;

public class S1RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr =new int[]{0,1,1,2,2,3,3};
        int l = removeDuplicates(arr);
        for(int i:arr) System.out.print(i+" ");
        System.out.println(l);
    }
    public static int removeDuplicates(int[] nums){
        if(nums.length==0){
            return  0;
        }
        int slow=0,fast=0;
        while(fast<nums.length){
            if(nums[fast]!=nums[slow]){
                slow++;
                nums[slow]=nums[fast];
            }
            fast++;
        }
        return slow+1;
    }
}
