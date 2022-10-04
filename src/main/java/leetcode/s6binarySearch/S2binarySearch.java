package leetcode.s6binarySearch;

public class S2binarySearch {
    public static void main(String[] args) {
        S2binarySearch obj = new S2binarySearch();
        int ret = obj.binarySearch(new int[]{1, 2, 3, 4,5}, 3);
        System.out.println(ret);
    }
    public int binarySearch(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left=mid+1;
            } else if (nums[mid]>target) {
                right=mid-1;
            }
        }
        return -1;
    }
}
