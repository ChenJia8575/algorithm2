package nowcoder;

import java.util.Scanner;

public class N6_HJ6_质数因子 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long k = (long) Math.sqrt(num);
        for (int i = 2; i <= k; i++) {
            while(num%i==0){
                System.out.print(i+" ");
                num=num/i;
            }
        }
        System.out.println(num == 1 ? "": num+" ");
    }
}
