package module2_Task2;
/*
 * ͨ���ײ���
 */
public class CommPackage  extends AbstractPackage implements CommInterface  {
	private  double CommTime;
	public static double CommTimeTotal=0;//�ܵ�ͨ���г�
	private int    shortMessage;
	
	public CommPackage(double c,int s)
	{
		this.CommTime=c;
		this.shortMessage=s;
	}
	
	public void CommAction(int CommComsumer,CardType t)
	{
		System.out.println("��ǰ����ͨ��"+CommComsumer+"����");
		CommTime-=CommComsumer;
		CommTimeTotal+=CommComsumer;
		
	}
	public  void show()
	{
		
		System.out.println("��ǰ�ײ���Ϣ"+"ͨ��ʱ��"+CommTime+"��������"+shortMessage);
	}

	@Override
	public void Action(int a) {
		// TODO Auto-generated method stub
		
	}
}
