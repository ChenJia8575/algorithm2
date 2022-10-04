package nowcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class N3_HJ3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n=Integer.valueOf(s);
        HashSet set =new HashSet();
        for (int i = 0; i < n; i++) {
            String s2 = br.readLine();
            int n2=Integer.valueOf(s2);
            set.add(n2);
        }
        Object[] arr = set.toArray();
        Arrays.sort(arr);
        for(Object x : arr){
            System.out.println(x);
        };
    }
}