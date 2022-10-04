package leetcode.s8状态机DP解决股票;

public class S3maxProfit_with_cool {
    public static void main(String[] args) {
        S3maxProfit_with_cool obj = new S3maxProfit_with_cool();
        int[] prices=new int[]{1,2,3,0,2};
        int ret = obj.maxProfit_with_cool(prices);
        System.out.println(ret);
    }
    public int maxProfit_with_cool(int[] prices){
        int n = prices.length;
        int[][] dp= new int[n][2];
        for(int i=0;i<n;i++){
            if(i==0){
                dp[i][0]=0;
                dp[i][1]=-prices[0];
                continue;
            }
            if(i==1){
                dp[i][0]=Math.max(dp[0][0],dp[0][1]+prices[i]);
                dp[i][1]=Math.max(dp[0][1],-prices[i]);
                continue;
            }
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-2][0]-prices[i]);
        }
        return dp[n-1][0];
    }
}
