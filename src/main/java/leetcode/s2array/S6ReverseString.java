package leetcode.s2array;

import leetcode.Util;

public class S6ReverseString {
    public static void main(String[] args) {
        char[] ret = reverseString(new char[]{'a', 'b', 'c'});
        Util.printCharArray(ret);
    }
    public static char[] reverseString(char[] s){
        int left=0,right=s.length-1;
        while(left<right){
            char tmp=s[left];
            s[left]=s[right];
            s[right]=tmp;
            left++;
            right--;
        }
        return s;
    }
}
