package leetcode.s2array;

public class S8LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abcdcya"));
    }
    public static String palindrome(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
    public static String longestPalindrome(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            String s1=palindrome(s,i,i);
            String s2=palindrome(s,i,i+1);
            String max = s1.length() > s2.length() ? s1 : s2;
            res = max.length() > res.length() ? max : res;
        }
        return res;
    }

}
