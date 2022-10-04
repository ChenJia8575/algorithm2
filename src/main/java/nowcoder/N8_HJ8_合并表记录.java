package nowcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class N8_HJ8_合并表记录 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.valueOf(br.readLine());

        Map map=new HashMap<Integer,Integer>();
        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            String[] arr = str.split(" ");
            if(map.containsKey(arr[0])){
                map.put(arr[0],map.get(arr[0])+arr[1]);
            }else{
                map.put(arr[0],arr[1]);
            }
        };
        Object[] objs = map.entrySet().toArray();
        Map.Entry<Integer,Integer>[] objs2=(Map.Entry<Integer,Integer>[])objs;
        Arrays.sort(objs2, new Comparator<Map.Entry<Integer,Integer>>() {
            @Override
            public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2) {
                if(o1.getKey()>o2.getKey()){
                    return 1;
                }else if (o1.getKey()<o2.getKey()){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
        for(Map.Entry<Integer,Integer> x : objs2){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}
