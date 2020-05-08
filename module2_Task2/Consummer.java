package module2_Task2;
/*
 * 消费信息类
 */
public class Consummer {
	public static void showMessage()
	{
		System.out.println("总的通话时长"+CommPackage.CommTimeTotal);
		System.out.println("总的上网流量"+NetPackage.NetTotal);
	}
}
