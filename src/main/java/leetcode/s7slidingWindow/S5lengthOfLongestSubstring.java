package leetcode.s7slidingWindow;

import leetcode.Util;

import java.util.ArrayList;
import java.util.HashMap;

public class S5lengthOfLongestSubstring {
    String str="";
    public static void main(String[] args) {

        //boolean ret = new S3checkInclusion ().checkInclusion ("eidbaooo", "ab");
        S5lengthOfLongestSubstring obj = new S5lengthOfLongestSubstring();
        int ret = obj.lengthOfLongestSubstring ("abcabcbb");
        System.out.println(ret);
        System.out.println(obj.str);
    }
    /* 滑动窗口算法框架 */
    public int lengthOfLongestSubstring (String s ) {
        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0;
        int  res = 0;
        while (right < s.length()) {
            // c 是将移入窗口的字符
            char c = s.charAt(right);
            // 增大窗口
            right++;
            window.put(c, window.getOrDefault(c, 0) + 1);
            // 进行窗口内数据的一系列更新

            /*** debug 输出的位置 ***/
            System.out.printf("window: [%d, %d)\n", left, right);
            /********************/

            // 判断左侧窗口是否要收缩
            while (window.get(c)>1) {
                // d 是将移出窗口的字符
                char d = s.charAt(left);
                // 缩小窗口
                left++;
                // 进行窗口内数据的一系列更新
                window.put(d, window.getOrDefault(d, 0) - 1);
            }
            res=Math.max(res,right-left);
            if(right-left>res)str=s.substring(left,right);
        }
        return res;
    }

}
