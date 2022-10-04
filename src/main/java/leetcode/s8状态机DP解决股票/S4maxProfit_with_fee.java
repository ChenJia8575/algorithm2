package leetcode.s8状态机DP解决股票;

public class S4maxProfit_with_fee {
    public static void main(String[] args) {
        S4maxProfit_with_fee obj = new S4maxProfit_with_fee();
        int[] prices=new int[]{1,3,2,8,4,9};
        int ret = obj.maxProfit_k_inf(prices,2);
        System.out.println(ret);
    }
    public int maxProfit_k_inf(int[] prices,int fee){
        int n = prices.length;
        int[][] dp= new int[n][2];
        for(int i=0;i<n;i++){
            if(i==0){
                dp[i][0]=0;
                dp[i][1]=-prices[0]-fee;
                continue;
            }
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]-fee);
        }

        return dp[n-1][0];
    }
}
