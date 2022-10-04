package leetcode.s7slidingWindow;

import java.util.HashMap;

public class S2minWindow {
    public static void main(String[] args) {

        String ret = new S2minWindow().minWindow("EBBANCF", "ABC");
        System.out.println(ret);
    }
    /* 滑动窗口算法框架 */
    public String minWindow(String s,String t) {
        HashMap<Character, Integer> need   = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for(char c:t.toCharArray()){
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int left = 0, right = 0;
        int valid=0;
        int start=0,len=Integer.MAX_VALUE;
        while (right < s.length()) {
            // c 是将移入窗口的字符
            char c = s.charAt(right);
            // 增大窗口
            right++;
            // 进行窗口内数据的一系列更新
            if(need.containsKey(c)){
                window.put(c, window.getOrDefault(c, 0) + 1);
                if(window.get(c).equals(need.get(c))){
                    valid++;
                }
            }

            /*** debug 输出的位置 ***/
            System.out.printf("window: [%d, %d)\n", left, right);
            /********************/

            // 判断左侧窗口是否要收缩
            while (valid ==need.size()) {
                if(right-left<len){
                    start=left;
                    len=right-left;
                }
                // d 是将移出窗口的字符
                char d = s.charAt(left);
                // 缩小窗口
                left++;
                // 进行窗口内数据的一系列更新
                if(need.containsKey(d)){
                    if(window.get(d)==need.get(d)){
                        valid--;
                    }
                    window.put(d, window.getOrDefault(d, 0) - 1);
                }
            }
        }
        return len==Integer.MAX_VALUE?"":s.substring(start,start+len);
    }


}
