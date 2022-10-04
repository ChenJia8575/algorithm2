package leetcode.s3tree;

public class S15coinChange {
    public static void main(String[] args) {
        S15coinChange obj = new S15coinChange();
        int ret = obj.coinChange(new int[]{1, 2, 5}, 11);
        System.out.println(ret);
        System.out.println(obj.coinstr);
    }
    public String coinstr="";
    public int coinChange(int[] coins,int amount){
        return dp(coins,amount);
    }
    public int dp(int[] coins,int amount){
        if(amount==0) return 0;
        if(amount<0) return -1;

        int res=Integer.MAX_VALUE;
        for(int coin:coins){
            int subProblem = dp(coins, amount - coin);
            if(subProblem==-1)continue;
            res = Math.min(res, subProblem + 1);
        }
        return res==Integer.MAX_VALUE?-1:res;
    }

}
