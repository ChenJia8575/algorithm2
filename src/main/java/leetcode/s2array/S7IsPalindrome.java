package leetcode.s2array;

/**
 * 回文串判断
 */
public class S7IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("abac"));
    }
    public static boolean isPalindrome(String s){
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
