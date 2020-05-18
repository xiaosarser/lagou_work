package module3_homework;

import java.util.HashMap;

public class HomeWork3 {
    public static void main(String[] args) {
        StringBuilder l1=new StringBuilder("123,456,789,123,456");
        HashMap<String,Integer> hashMap = new HashMap<>();
        int i=0,j=0;
        while(j<=l1.length())
        {
            //双指针来截取字符串
            if(j==l1.length()||l1.charAt(j)==',')
            {
                if(hashMap.containsKey(l1.substring(i,j)))
                {
                    int temp=hashMap.get(l1.substring(i,j));
                    hashMap.replace(l1.substring(i,j),temp+1);

                }
                else
                {
                    hashMap.put(l1.substring(i,j),1);
                }
                j++;
                i=j;
            }
            else
            {
                j++;
            }
        }
        for (String key : hashMap.keySet()) {
            System.out.println("字符"+key+"一共有"+hashMap.get(key)+"个");

        }
    }
}
