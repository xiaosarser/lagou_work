package module2_Task2;
/*
 * 通话套餐类
 */
public class CommPackage  extends AbstractPackage implements CommInterface  {
	private  double CommTime;
	public static double CommTimeTotal=0;//总的通话市场
	private int    shortMessage;
	
	public CommPackage(double c,int s)
	{
		this.CommTime=c;
		this.shortMessage=s;
	}
	
	public void CommAction(int CommComsumer,CardType t)
	{
		System.out.println("当前消费通话"+CommComsumer+"分钟");
		CommTime-=CommComsumer;
		CommTimeTotal+=CommComsumer;
		
	}
	public  void show()
	{
		
		System.out.println("当前套餐信息"+"通话时长"+CommTime+"短信条数"+shortMessage);
	}

	@Override
	public void Action(int a) {
		// TODO Auto-generated method stub
		
	}
}
