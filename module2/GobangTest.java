package module2;
import java.util.Scanner;

public class GobangTest {
	public static void main(String[] args)
	{
		Gobang goPlayer=new Gobang();//��ʼ��һ����������Ϸ
		int player=0;
		while(true)
		{
			if(player%2==0)				
			{
				System.out.println("��ǰ�Ǻ췽����");
			}
			else
			{
				System.out.println("��ǰ�Ǻڷ�����");
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("�����������");
		    int x = sc.nextInt();
		    System.out.println("������������");
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
