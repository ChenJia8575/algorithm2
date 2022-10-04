package leetcode.s3tree;

public class S14fibDp2 {
    public static void main(String[] args) {
        int ret = new S14fibDp2().fib(20);
        System.out.println(ret);
    }
    public int fib(int n){
        if(n==0)return 0;
        int a=1,b=1;
        int temp=1;
        for(int i=3;i<=n;i++){
            temp=a+b;
            a=b;
            b=temp;
        }
        return temp;
    }
}
