package leetcode.s3tree;

public class S12fibHelper {
    public int sum=0;
    public static void main(String[] args) {
        S12fibHelper obj = new S12fibHelper();
        int ret=obj.fib(20);
        System.out.println(ret);
        System.out.println(obj.sum);
    }
    public int fib(int n){
        int[] memo=new int[n+1];
        return helper(memo,n);
    };

    int helper(int [] memo,int n){
        this.sum=this.sum+1;
        if(n==0||n==1)return n;
        if(memo[n]!=0)return memo[n];
        memo[n]=helper(memo,n-1)+helper(memo,n-2);
        return memo[n];
    }
}
