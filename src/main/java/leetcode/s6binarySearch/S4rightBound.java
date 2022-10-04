package leetcode.s6binarySearch;

public class S4rightBound {
    public static void main(String[] args) {
        S4rightBound obj = new S4rightBound();
        int ret = obj.right_bound(new int[]{1, 2, 2, 4,4,5}, 4);
        System.out.println(ret);
    }
    public int right_bound(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else if (nums[mid]>target) {
                right=mid-1;
            }else if(nums[mid]==target){
                left=mid+1;
            }
        }
        if(left<1) return -1;
        return nums[left-1]==target?left-1:-1;
    }
}
