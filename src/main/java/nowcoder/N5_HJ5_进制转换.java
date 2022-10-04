package nowcoder;

import java.util.Scanner;

public class N5_HJ5_进制转换 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String str2=str.substring(2);
        System.out.println(Integer.valueOf(str2,16));
    }
}
