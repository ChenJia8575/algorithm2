package leetcode.s8状态机DP解决股票;

public class S1maxProfit_k_1 {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        int[] prices2 = new int[]{7,6,5,4,1};
        int ret = new S1maxProfit_k_1().mapProfit_k_1(prices2);
        System.out.println(ret);
    }
    public int mapProfit_k_1(int[] prices){
        int n=prices.length;
        int[][] dp = new int[n][2];
        for(int i=0;i<n;i++){
            if(i-1==-1){
                dp[i][0]=0;
                dp[i][1]=-prices[i];
                continue;
            }
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],-prices[i]);
        }
        return dp[n-1][0];
    }
}
