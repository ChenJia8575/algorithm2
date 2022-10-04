package nowcoder;

import org.junit.Test;

public class N15_背包 {
    public int testPack(int[] weight, int[] value, int cap){
        if(cap == 0 || weight.length == 0){
            return 0;
        }
        int len = weight.length;
        int[][] f = new int[len][cap + 1];//cap+1因为给定容量为cap，因此j的循环必须到cap
        for(int j = 1; j < cap + 1; j++){
            for(int i = 0; i < len; i++){
                if(weight[i] > j){//如果当前宝石重量大于整个背包的承重
                    if(i == 0){//如果当前只考虑了第一块宝石
                        f[i][j] = 0;
                    }else {
                        f[i][j] = f[i - 1][j];
                    }
                }else{
                    if(i == 0){//如果当前只考虑了第一块宝石
                        f[i][j] = value[i];
                    }else {
                        f[i][j] = Math.max(f[i - 1][j], f[i - 1][j - weight[i]] + value[i]);
                    }
                }
            }
        }
        return f[len - 1][cap];
    }

    @Test
    public void test(){
        int[] weight = new int[] {2, 2, 6, 5, 4};
        int[] value = new int[] {6, 3, 5, 4, 6};

        for (int cap = 1; cap <= 10; cap++) {
            System.out.println(cap+"---");
            System.out.println(testPack(weight, value, cap));//输出为表格中对应数据
        }
    }
}
