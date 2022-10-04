package nowcoder;

import java.util.*;
public class N15_4_动态规划_字符串通配符 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String t=sc.nextLine();
            String s=sc.nextLine();
            System.out.println(match(t,s));
        }
    }
    public static boolean match(String t,String s){
        char[] ct=t.toCharArray();
        char[] cs=s.toCharArray();
        int lt=ct.length;
        int ls=cs.length;
        boolean[][] dp=new boolean[ls+1][lt+1];
        dp[0][0]=true;
        for(int i=0;i<=ls;i++){
            for(int j=1;j<=lt;j++){
                if(ct[j-1]=='*'){
                    if(i==0){
                        dp[i][j]=dp[i][j-1];
                    }else{
                        if(cs[i-1]=='.' || (cs[i-1]>='0'&&cs[i-1]<='9') ||
                                (cs[i-1]>='a'&&cs[i-1]<='z') ||(cs[i-1]>='A'&&cs[i-1]<='Z')
                        ) {
                            dp[i][j]=dp[i-1][j] || dp[i][j-1];
                        }

                    }

                }else{
                    if(i>0 && defs(ct[j-1],cs[i-1])){
                        dp[i][j]=dp[i-1][j-1];
                    }
                }
            }
        }
        return  dp[ls][lt];
    }
    public static boolean defs(char t,char s){
        if(t=='?') return true;
        if(t>='a'&&t<='z'){
            t=(char)(t-'a'+'A');

        }
        if(s>='a'&&s<='z'){
            s=(char)(s-'a'+'A');
        }
        return s == t;
    }
}

