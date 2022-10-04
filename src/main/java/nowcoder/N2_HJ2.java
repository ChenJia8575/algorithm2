package nowcoder;

import java.util.Scanner;

public class N2_HJ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String s = sc.nextLine();
        String str2 = str.toLowerCase();
        char c = s.toLowerCase().charAt(0);
        int sum=0;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i)==c){
                sum+=1;
            }
        }
        System.out.println(sum);
    }
}
