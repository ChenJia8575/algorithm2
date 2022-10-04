package leetcode.s8状态机DP解决股票;

public class S2maxProfit_k_inf {
    public static void main(String[] args) {
        S2maxProfit_k_inf obj = new S2maxProfit_k_inf();
        int[] prices=new int[]{7,1,5,3,6,4};
        int[] prices2=new int[]{1,2,3,4,5};
        int ret = obj.maxProfit_k_inf(prices2);
        System.out.println(ret);
    }
    public int maxProfit_k_inf(int[] prices){
        int n = prices.length;
        int[][] dp= new int[n][2];
        for(int i=0;i<n;i++){
            if(i==0){
                dp[i][0]=0;
                dp[i][1]=-prices[0];
                continue;
            }
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }

        return dp[n-1][0];
    }
}
