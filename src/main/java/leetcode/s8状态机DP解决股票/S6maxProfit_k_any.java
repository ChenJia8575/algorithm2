package leetcode.s8状态机DP解决股票;

public class S6maxProfit_k_any {
    public static void main(String[] args) {
        S6maxProfit_k_any obj = new S6maxProfit_k_any();
        int[] prices=new int[]{3,2,6,5,0,3};
        int ret = obj.maxProfit_k_any(prices,2);
        System.out.println(ret);
    }
    public int maxProfit_k_any(int[] prices ,int max_k){
        int n = prices.length;
        if (max_k > n / 2) {
            // 复用之前交易次数 k 没有限制的情况
            return maxProfit_k_any(prices,max_k);
        }
        int[][][] dp= new int[n][max_k+1][2];
        //k=0时的base case
        for(int i=0;i<n;i++){
            dp[i][0][1]=Integer.MIN_VALUE;
            dp[i][0][0]=0;
        }
        for(int i=0;i<n;i++){
            for(int k=max_k;k>=1;k--){
                if(i==0){
                    dp[i][k][0]=0;
                    dp[i][k][1]=-prices[0];
                    continue;
                }
                dp[i][k][0]=Math.max(dp[i-1][k][0],dp[i-1][k][1]+prices[i]);
                dp[i][k][1]=Math.max(dp[i-1][k][1],dp[i-1][k-1][0]-prices[i]);
            }

        }
//        for(int i=0;i<n;i++){
//            System.out.println("i="+i);
//            for(int k=max_k;k>=1;k--){
//                System.out.print("【k="+k+",0,"+dp[i][k][0]+" 】");
//                System.out.print("【k="+k+",1,"+dp[i][k][1]+" 】");;
//            }
//            System.out.println();
//        }
        //为什么是max_k时取取大？
        return dp[n-1][max_k][0];
    }
}
