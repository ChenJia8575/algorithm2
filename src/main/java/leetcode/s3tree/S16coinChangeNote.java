package leetcode.s3tree;

import java.util.Arrays;

public class S16coinChangeNote {
    public static void main(String[] args) {
        S16coinChangeNote obj = new S16coinChangeNote();
        int ret = obj.coinChange(new int[]{1, 2, 5}, 11);
        System.out.println(ret);
        for(int i=1;i<=obj.memo.length-1;i++) {
            System.out.println("总钱"+i+" ,最小个数"+obj.memo[i]+" ,分别是"+obj.coinarr[i]);
        }
    }
    int[] memo;
    /**
     * 为了获取每种情况的具体金币
     */
    String[] coinarr;
    public int coinChange(int[] coins,int amount){
        memo=new int[amount+1];
        coinarr=new String[amount+1];
        Arrays.fill(memo,-9);
        Arrays.fill(coinarr,"");
        return dp(coins,amount);
    }
    public int dp(int[] coins,int amount){
        //base case
        if(amount==0) return 0;
        if(amount<0) return -1;
        if(memo[amount]!=-9)
            return memo[amount];
        int res=Integer.MAX_VALUE;
        for(int coin:coins){
            //计算子问题的结果
            int subProblem = dp(coins, amount - coin);
            //子问题无解则跳过
            if(subProblem==-1)continue;
            //在子问题中选择最优解，再+1
            if(subProblem + 1<res){
                res=subProblem + 1;
                //子问题的各金币+当前尝试的金币
                coinarr[amount]=coin+" "+coinarr[amount - coin];
            }
        }
        if(res==Integer.MAX_VALUE) res=-1;
        System.out.println("计算出"+amount+",最小个数"+res+",分别是"+coinarr[amount]);
        memo[amount]=res;
        return res;
    }

}
