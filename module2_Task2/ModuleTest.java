package module2_Task2;

public class ModuleTest {
	
	
	public static void main(String[] args)
	{
		MobileCard mobileCard=new MobileCard(CardType.BIG,"1234", "xiao","1234", 234.4, 100,100);
		CommPackage a1=new CommPackage(mobileCard.getCommTime(),100);
		NetPackage a2=new NetPackage(mobileCard.getNetConsumm());
		System.out.println("当前手机卡信息");
		System.out.println("卡类型"+mobileCard.getCardType());
		System.out.println("卡号"+mobileCard.getCardNum());
		System.out.println("姓名"+mobileCard.getName());
		System.out.println("密码"+mobileCard.getPassword());
		System.out.println("通话时间"+mobileCard.getCommTime());
		System.out.println("钱"+mobileCard.getMoney());
		System.out.println("上网流量"+mobileCard.getNetConsumm());
		a1.CommAction(10, CardType.BIG);
		a1.show();
		a2.NetAction(10, CardType.BIG);
		a2.show();
		Consummer.showMessage();
		a2.NetAction(10, CardType.BIG);
		Consummer.showMessage();
		
		
		
		
		
	}
}
