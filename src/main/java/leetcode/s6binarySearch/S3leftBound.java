package leetcode.s6binarySearch;

public class S3leftBound {
    public static void main(String[] args) {
        S3leftBound obj = new S3leftBound();
        int ret = obj.left_bound(new int[]{1, 2, 2, 4,4,5}, 4);
        System.out.println(ret);
    }
    public int left_bound(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else if (nums[mid]>target) {
                right=mid-1;
            }else if(nums[mid]==target){
                right=mid-1;
            }
        }
        if(left==nums.length) return -1;
        return nums[left]==target?left:-1;
    }
}
