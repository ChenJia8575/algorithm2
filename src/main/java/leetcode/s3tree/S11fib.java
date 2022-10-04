package leetcode.s3tree;

public class S11fib {
    static int sum=0;
    public static void main(String[] args) {
        int ret = new S11fib().fib(20);
        System.out.println(ret);
        System.out.println(sum);
    }
    public int fib(int n){
        sum++;
        if(n==1||n==2)return 1;
        return fib(n-1)+fib(n-2);
    }
}
