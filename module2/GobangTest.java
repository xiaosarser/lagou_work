package module2;
import java.util.Scanner;
import java.util.*;


public class GobangTest {
	public static void main(String[] args)
	{
		Gobang goPlayer=new Gobang();//初始化一局五子棋游戏
//		List<Integer> listX=new ArrayList<Integer>();
//		List<Integer> listY=new ArrayList<Integer>();
		List<List<Integer>> corr=new ArrayList<List<Integer>>();
		
		int player=0;
		while(true)
		{
			if(player%2==0)				
			{
				System.out.println("当前是红方落子");
			}
			else
			{
				System.out.println("当前是黑方落子");
			}
			Scanner sc = new Scanner(System.in);
			int x;
			int y;
			while(true)
			{
				System.out.println("请输入横坐标");
			    x = sc.nextInt();
			    System.out.println("请输入纵坐标");
			    y = sc.nextInt();
			    List<Integer> temp=new ArrayList<Integer>();
			    temp.add(x);
			    temp.add(y);
			    if(x>=1&&x<=16&&y>=1&&y<=16&&!corr.contains(temp))
			    {
			    	corr.add(temp);
			    	break;
			    }
			    else
			    {
			    	System.out.println("坐标输入错误，请重新输入!");
			    }
			    
			}
			
		    goPlayer.Play(x, y, player);
		    if(goPlayer.isWinner(x, y))
		    {
		    	return;
		    }
		    player++;
		    
		}
	}
}
