package module2;
import java.util.Scanner;

public class GobangTest {
	public static void main(String[] args)
	{
		Gobang goPlayer=new Gobang();//初始化一局五子棋游戏
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
			System.out.println("请输入横坐标");
		    int x = sc.nextInt();
		    System.out.println("请输入纵坐标");
		    int y = sc.nextInt();
		    goPlayer.Play(x, y, player);
		    if(goPlayer.isWinner(x, y))
		    {
		    	return;
		    }
		    player++;
		    
		}
	}
}
