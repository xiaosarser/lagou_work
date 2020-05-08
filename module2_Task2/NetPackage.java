package module2_Task2;
/*
 * 上网套餐类
 */
public class NetPackage extends AbstractPackage implements NetInterface {
	private double NetComsummer;
	public static double NetTotal=0;//总的上网流量
	
	public NetPackage(double c)
	{
		this.NetComsummer=c;
	}
	public NetPackage()
	{
		
	}
	public  void NetAction(int netComsumer,CardType t)
	{
		System.out.println("当前消费流量"+netComsumer+"M");
		NetComsummer-=netComsumer;
		NetTotal+=netComsumer;
	}
	public  void show()
	{
		System.out.println("当前套餐信息"+"流量"+NetComsummer);
	}
	@Override
	public void Action(int a) {
		// TODO Auto-generated method stub
		
	}
	
}
