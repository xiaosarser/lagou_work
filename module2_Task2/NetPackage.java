package module2_Task2;
/*
 * �����ײ���
 */
public class NetPackage extends AbstractPackage implements NetInterface {
	private double NetComsummer;
	public static double NetTotal=0;//�ܵ���������
	
	public NetPackage(double c)
	{
		this.NetComsummer=c;
	}
	public NetPackage()
	{
		
	}
	public  void NetAction(int netComsumer,CardType t)
	{
		System.out.println("��ǰ��������"+netComsumer+"M");
		NetComsummer-=netComsumer;
		NetTotal+=netComsumer;
	}
	public  void show()
	{
		System.out.println("��ǰ�ײ���Ϣ"+"����"+NetComsummer);
	}
	@Override
	public void Action(int a) {
		// TODO Auto-generated method stub
		
	}
	
}
