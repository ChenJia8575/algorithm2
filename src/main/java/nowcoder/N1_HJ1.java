package nowcoder;

import javax.swing.*;
import java.util.Scanner;

public class N1_HJ1 {
    public static void main(String[] args) {
        //计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000
        //创建Scanner对象，接受从控制台输入
        Scanner input=new Scanner(System.in);
        //接受String类型
        String str=input.nextLine();
        String[] arr=str.split(" ");
        int l=arr[arr.length-1].length();
        System.out.println(l);

    }
}
