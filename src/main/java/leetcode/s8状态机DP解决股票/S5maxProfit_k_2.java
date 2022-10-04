package leetcode.s8状态机DP解决股票;

public class S5maxProfit_k_2 {
    public static void main(String[] args) {
        S5maxProfit_k_2 obj = new S5maxProfit_k_2();
        int[] prices=new int[]{3,3,5,0,0,3,1,4};
        int ret = obj.maxProfit_k_2(prices);
        System.out.println(ret);
    }
    public int maxProfit_k_2(int[] prices ){
        int n = prices.length;
        int max_k=2;
        int[][][] dp= new int[n][max_k+1][2];
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
