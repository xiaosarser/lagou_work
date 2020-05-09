package module2;


public class Gobang {
	public static final int BoardLen=17;//���̵ĳ���
	
	public static String[][]GoBangBoard()
	{
		String[][] Board=new String[BoardLen][BoardLen];
		for(int i=0;i<BoardLen;i++)
		{
			for(int j=0;j<BoardLen;j++)
			{
				if(i==0&&j==0)
				{
					Board[i][j]=" ";
				}
				else if(i==0||j==0)
				{
					if(i+j<=9)
					{
						char[] temp=new char[2];
						temp[0]=(char)(i+j+48);
						temp[1]=' ';											
						Board[i][j]=new String(temp);
					}
					else
					{
						//Board[i][j]=(char)(i+j-10+97);
						char[] temp=new char[2];
						temp[0]=(char)(i+j-10+97);
						temp[1]=' ';											
						Board[i][j]=new String(temp);
					}
				}
				else Board[i][j]=". ";
			}
		}
		return Board;
	}
	public static String[][] Board=GoBangBoard();
	public static void ShowBoard()
	{
		for(int i=0;i<BoardLen;i++)
		{
			for(int j=0;j<BoardLen;j++)
			{
				System.out.print(Board[i][j]);
			}
			System.out.print('\n');
		}
	}
	
	public void Play(int x,int y,int redOrblack)
	{
		//�������ӵ�����ͺ�ڷ�
		try
		{
			if(redOrblack%2==0)
			{
				if(Board[x][y]==". ")
				{
					Board[x][y]="��";//�췽����
					ShowBoard();
				}
				else
				{
					System.out.println("ֻ���ڿհ�λ�����ӣ�");
				}
				
				if(isWinner(x,y))
				{
					System.out.println("�췽��ʤ��");
					return;
				}
			}
			else if(redOrblack%2==1)
			{
				if(Board[x][y]==". ")
				{
					Board[x][y]="�� ";//�ڷ�����
					ShowBoard();
				}
				else
				{
					System.out.println("ֻ���ڿհ�λ�����ӣ�");
				}
				if(isWinner(x,y))
				{
					System.out.println("�ڷ���ʤ��");
					return;
				}
			}
		}catch(Exception e){
			System.out.println("��������Խ�磡����������");
			e.printStackTrace();
		}
	}
	public boolean isWinner(int x,int y)
	{
		String currentPieces=Board[x][y];//��ǰ����
		/**
		 * *�ֱ��жϺ�������б���Ƿ�����������
		 */
		int Currentcount=1;//��ǰ�������
		int Maxcount=1;//����������
		for(int i=x-4>=1?x-4:1;i<(x+4>BoardLen-1?BoardLen-1:x+4);i++)
		{
			if(Board[i][y]==currentPieces&&Board[i][y]==Board[i+1][y])
			{
				Currentcount++;
			}
			else
			{
				//�����������
				Maxcount=Currentcount;
				Currentcount=1;										
			}
			if(Currentcount==5||Maxcount==5)
			{
				return true;
			}
		}
		for(int j=y-4>=1?y-4:1;j<(y+4>BoardLen-1?BoardLen-1:y+4);j++)
		{
			if(Board[x][j]==currentPieces&&Board[x][j]==Board[x][j+1])
			{
				Currentcount++;
			}
			else
			{
				//�����������
				Maxcount=Currentcount;
				Currentcount=1;										
			}
			if(Currentcount==5||Maxcount==5)
			{
				return true;
			}
		}
		for(int i=x-4>=1?x-4:1, j=y-4>=1?y-4:1;i<(x+4>BoardLen-1?BoardLen-1:x+4)&&j<(y+4>BoardLen-1?BoardLen-1:y+4);i++,j++)
		{
			if(Board[i][j]==currentPieces&&Board[i][j]==Board[i][j])
			{
				Currentcount++;
			}
			else
			{
				//�����������
				Maxcount=Currentcount;
				Currentcount=1;										
			}
			if(Currentcount==5||Maxcount==5)
			{
				return true;
			}
		}
		
		return false;		
	}	
}
