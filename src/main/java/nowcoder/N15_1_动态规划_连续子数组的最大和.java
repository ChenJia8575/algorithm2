package nowcoder;

import java.util.*;
public class N15_1_动态规划_连续子数组的最大和 {
    public static void main(String[] args) {
        String str1 = "asdfas";
        String str2 = "werasdfaswer";
        System.out.println(GetMaxLen(str1,str2));
    }

    public static int GetMaxLen(String str1,String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        int len1= arr1.length;
        int len2 = arr2.length;
        int[][] maxSubLen = new int[len1+1][len2+1];
        int maxLen = 0;
        for(int i = 1;i <= len1;i++) {

            for(int j = 1;j <= len2;j++) {
                if(arr1[i -1] == arr2[j -1]) {
                    System.out.println("i="+i+",j="+j+",arr1[i-1]="+arr1[i -1]+",arr2[j-1]="+arr2[j -1]);
                    maxSubLen[i][j] = maxSubLen[i-1][j-1] + 1;
                }
                if(maxLen < maxSubLen[i][j]) {
                    maxLen = maxSubLen[i][j];
                }
            }
        }
        System.out.println("maxSubLen内容是");
        for(int i = 0;i < maxSubLen.length;i++) {
            for(int j = 0;j < maxSubLen[i].length;j++) {
                System.out.print(maxSubLen[i][j]);
            }
            System.out.println();
        }

        return maxLen;
    }
}
