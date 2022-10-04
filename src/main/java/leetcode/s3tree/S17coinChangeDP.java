package leetcode.s3tree;

import leetcode.Util;

import java.util.Arrays;

public class S17coinChangeDP {

    int[] dp;
    public static void main(String[] args) {
        S17coinChangeDP obj = new S17coinChangeDP();
        int[] coins=new int[]{1,2,5};
        int amount=11;
        obj.dp=new int[amount+1];
        Arrays.fill(obj.dp,amount+1);
        obj.dp[0]=0;
        int ret = obj.coinChange(coins, amount);
        System.out.println(ret);
        Util.printIntArray(obj.dp);
    }
    public int coinChange(int[] coins,int amount){
        for(int i=0;i<dp.length;i++){
            for(int coin:coins){
                if(i-coin<0)continue;
                dp[i]=Math.min(dp[i],dp[i-coin]+1);
            }
        }
        return (dp[amount]==amount+1)?-1:dp[amount];
    }
}
