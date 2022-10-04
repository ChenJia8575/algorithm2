package leetcode.s3tree;

public class S13fibDp {
    public static void main(String[] args) {
        int ret = new S13fibDp().fib(20);
        System.out.println(ret);
    }
    public int fib(int n){
        if(n==0)return 0;
        int[] dp=new int[n+1];
        dp[0]=0;dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
