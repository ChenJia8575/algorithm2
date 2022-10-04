package leetcode;

import java.util.List;

public class Util {
    public static void main(String[] args) {
        printIntArray(new int[]{2,4,7});
    }
    public static  String arrayInt2Str(int[] arr){
        String str="[";
        for(int x:arr)str+=x+",";
        return str.substring(0,str.length() - 1)+"]";
    }
    public static  String arrayChar2Str(char[] arr){
        String str="[";
        for(char x:arr)str+=x+",";
        return str.substring(0,str.length() - 1)+"]";
    }
    public static  String arrayBoolean2Str(boolean[] arr){
        String str="[";
        for(boolean x:arr)str+=x+",";
        return str.substring(0,str.length() - 1)+"]";
    }
    public static  <T> String arrayT2Str(T[] arr){
        String str="[";
        for(T x:arr){
            str+=x+",";
        }
        return str.substring(0,str.length() - 1)+"]";
    }

    public static <T> String listT2Str(List<T> arr){
        String str="[";
        for(T x:arr){
            str+=x+",";
        }
        return str.substring(0,str.length() - 1)+"]";
    }
    public static <T> String listListT2Str(List<List<T>> arr){
        String str="";
        for(int i=0;i<arr.size();i++){
            List<T> temp = arr.get(i);
            for(int j=0;j<temp.size();j++){
                str+=temp.get(j)+" ";
            }
            str+="\n";
        }
        return str;
    }
    public static void printIntArray(int[] arr){
        System.out.println(arrayInt2Str(arr));
    }
    public static void printCharArray(char[] arr){
        System.out.println(arrayChar2Str(arr));
    }
    public static <T> void printArrayT(T[] arr){System.out.println(arrayT2Str(arr));}
    public static <T> void printListListT(List<List<T>> arr){System.out.println(listListT2Str(arr));}
}
