package module3_homework;
/*
编程获取两个指定字符串中的最大相同子串。
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HomeWork2 {
    String maxSubString(String l1,String l2)
    {
        char[] a = l1.toCharArray();
        char[] b = l2.toCharArray();
        String res=" ";

        // a.length行，b.length列
        int[][] result = new int[a.length + 1][b.length + 1];
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    result[i + 1][j + 1] = result[i][j] + 1;

                    if(result[i + 1][j + 1]>max)//当前最大长度更新
                    {
                        max = Math.max(max, result[i + 1][j + 1]);
                        res=l1.substring(i+1-max,i+1);
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        HomeWork2 h=new HomeWork2();
        System.out.println(h.maxSubString(new String("asdafghjka"),new String("aaasdfg")));
    }
}
