package module2;


public class Gobang {
	public static final int BoardLen=16;//棋盘的长宽
	
	public static char[][]GoBangBoard()
	{
		char[][] Board=new char[BoardLen][BoardLen];
		for(int i=0;i<BoardLen;i++)
		{
			for(int j=0;j<BoardLen;j++)
			{
				Board[i][j]='.';//初始化棋盘
			}
		}
		return Board;
	}
	public static char[][] Board=GoBangBoard();
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
		//输入棋子的坐标和红黑方
		try
		{
			if(redOrblack%2==0)
			{
				if(Board[x][y]=='.')
				{
					Board[x][y]='+';//红方下棋
					ShowBoard();
				}
				else
				{
					System.out.println("只能在空白位置落子！");
				}
				
				if(isWinner(x,y))
				{
					System.out.println("红方获胜！");
					return;
				}
			}
			else if(redOrblack%2==1)
			{
				if(Board[x][y]=='.')
				{
					Board[x][y]='*';//黑方下棋
					ShowBoard();
				}
				else
				{
					System.out.println("只能在空白位置落子！");
				}
				if(isWinner(x,y))
				{
					System.out.println("黑方获胜！");
					return;
				}
			}
		}catch(Exception e){
			System.out.println("输入坐标越界！请重新输入");
			e.printStackTrace();
		}
	}
	public boolean isWinner(int x,int y)
	{
		char currentPieces=Board[x][y];//当前棋子
		/**
		 * *分别判断横向，竖向斜向是否有五子连珠
		 */
		int Currentcount=1;//当前连珠个数
		int Maxcount=1;//最大连珠个数
		for(int i=x-4>=0?x-4:0;i<(x+4>BoardLen-1?BoardLen-1:x+4);i++)
		{
			if(Board[i][y]==currentPieces&&Board[i][y]==Board[i+1][y])
			{
				Currentcount++;
			}
			else
			{
				//连珠个数归零
				Maxcount=Currentcount;
				Currentcount=1;										
			}
			if(Currentcount==5||Maxcount==5)
			{
				return true;
			}
		}
		for(int j=y-4>=0?y-4:0;j<(y+4>BoardLen-1?BoardLen-1:y+4);j++)
		{
			if(Board[x][j]==currentPieces&&Board[x][j]==Board[x][j+1])
			{
				Currentcount++;
			}
			else
			{
				//连珠个数归零
				Maxcount=Currentcount;
				Currentcount=1;										
			}
			if(Currentcount==5||Maxcount==5)
			{
				return true;
			}
		}
		for(int i=x-4>=0?x-4:0, j=y-4>=0?y-4:0;i<(x+4>BoardLen-1?BoardLen-1:x+4)&&j<(y+4>BoardLen-1?BoardLen-1:y+4);i++,j++)
		{
			if(Board[i][j]==currentPieces&&Board[i][j]==Board[i][j])
			{
				Currentcount++;
			}
			else
			{
				//连珠个数归零
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
