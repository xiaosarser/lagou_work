package module2;
import java.util.Scanner;
import java.util.*;


public class GobangTest {
	public static void main(String[] args)
	{
		Gobang goPlayer=new Gobang();//��ʼ��һ����������Ϸ
//		List<Integer> listX=new ArrayList<Integer>();
//		List<Integer> listY=new ArrayList<Integer>();
		List<List<Integer>> corr=new ArrayList<List<Integer>>();
		
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
			int x;
			int y;
			while(true)
			{
				System.out.println("�����������");
			    x = sc.nextInt();
			    System.out.println("������������");
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
			    	System.out.println("���������������������!");
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
