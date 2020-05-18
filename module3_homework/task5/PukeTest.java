package module_homework.task5;

import java.util.ArrayList;
import java.util.Map;

import java.util.HashMap;
import java.util.Scanner;

public class PukeTest {
    public static void main(String[] args) {
        Puke.getPuke();
        Puke.createPukeMap();
        Puke playPuke=new Puke();

        ArrayList<String> p1=new ArrayList<String>();//默认p1 是地主
        ArrayList<String> p2=new ArrayList<String>();
        ArrayList<String> p3=new ArrayList<String>();
        for(int i=0;i<Puke.puke.size()-3;i++)
        {
            if(i%3==0)
            {

                p1.add(Puke.puke.get(i));

            }
            else if(i%3==1)
            {
                p2.add(Puke.puke.get(i));
            }
            else if(i%3==2)
            {
                p3.add(Puke.puke.get(i));
            }
        }
        p1.add(Puke.puke.get(Puke.puke.size()-1));
        p1.add(Puke.puke.get(Puke.puke.size()-2));
        p1.add(Puke.puke.get(Puke.puke.size()-3));
        System.out.println("3张底牌是"+'\n'+p1.get(p1.size()-1)+" "+p1.get(p1.size()-2)+" "+p1.get(p1.size()-3));
        Scanner sc=new Scanner(System.in);
        System.out.println("选择0 退出" +
                "选择1 查看1号玩家底牌" +
                "选择2 查看2号玩家底牌" +
                "选择3 查看3号玩家底牌");

        while(true)
        {
           int index=sc.nextInt();

           switch (index)
           {
               case 1:
                   System.out.print("玩家1手中的牌是+'\n" +
                           "'");
                   playPuke.sortPuke(p1);
                   System.out.println('\n');
                   break;
               case 2:
                   System.out.println("玩家2手中的牌是");
                   playPuke.sortPuke(p2);
                   System.out.println('\n');
                   break;
               case 3:
                   System.out.println("玩家3手中的牌是");
                   playPuke.sortPuke(p3);
                   break;
               case 0:
                   return;

           }

        }

    }


}
