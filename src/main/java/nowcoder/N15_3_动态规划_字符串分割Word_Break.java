package nowcoder;

import java.util.*;
public class N15_3_动态规划_字符串分割Word_Break {
    public static void main(String[] args) {
        String s = "leetcode";
        Set<String> dict=new HashSet<>();
        dict.add("leet");
        dict.add("code");
        System.out.println(wordBreak(s, dict));
    }
    public static boolean wordBreak(String s, Set<String> dict) {
        // boolean 数组
        boolean[] canBreak = new boolean[s.length()+1];
        // 初始化
        canBreak[0] = true;

        for(int i = 1;i <= s.length();i++) {

            //j < i && F(j) && [j+1,i]
            for(int j = 0;j < i;j++) {
                //subString 左闭右开
                if(canBreak[j] && dict.contains(s.substring(j,i))) {
                    canBreak[i] = true;
                    break;
                }
            }
        }
        for(int i = 0;i < canBreak.length;i++) {
            System.out.print(canBreak[i]+" ");
        }
        return canBreak[s.length()];

    }
}

