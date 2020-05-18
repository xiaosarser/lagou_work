package module_homework.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Puke {
    static HashMap<String,Integer> pukeMap=new HashMap<String,Integer>();
    static ArrayList<String> puke=new ArrayList<String>();
    static void createPukeMap()
    {
        pukeMap.put("大王",1);
        pukeMap.put("小王",2);
        pukeMap.put("2",3);
        pukeMap.put("A",4);
        pukeMap.put("K",5);
        pukeMap.put("Q",6);
        pukeMap.put("J",7);
        pukeMap.put("10",8);
        pukeMap.put("9",9);
        pukeMap.put("8",10);
        pukeMap.put("7",11);
        pukeMap.put("6",12);
        pukeMap.put("5",13);
        pukeMap.put("4",14);
        pukeMap.put("3",15);
    }
    static  ArrayList<String> getPuke()
    {
        //扑克乱序

        for(int i=1;i<=13;i++)
        {
            for(int j=1;j<=4;j++)
            {
                switch (i)
                {
                    case 1:puke.add("A");break;
                    case 11: puke.add("J");break;
                    case 12: puke.add("Q");break;
                    case 13: puke.add("K");break;
                    default: puke.add(String.valueOf(i));break;
                }
            }
        }
        puke.add("小王");
        puke.add("大王");
        Collections.shuffle(puke);
        return puke;
    }
    void sortPuke(ArrayList<String> l)
    {

        //把手上的扑克牌顺序存放，可以利用HashMap l是原始的某个人的手中的牌
        HashMap<Integer,ArrayList<String>> temp=new HashMap<Integer,ArrayList<String> >();
        for(String p:l)
        {
            //p是手上的牌
            int index=pukeMap.get(p);
            if(temp.containsKey(index))
            {
                temp.get(index).add(p);
            }
            else
            {
                ArrayList<String> t=new ArrayList<String>();
                t.add(p);
                temp.put(index,t);
            }

        }
        for (Map.Entry<Integer,ArrayList<String>> entry : temp.entrySet()) {
            for(String s:entry.getValue())
            {
                System.out.print(s+" ");
            }
        }
    }

}
