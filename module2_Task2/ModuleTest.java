package module2_Task2;

public class ModuleTest {
	
	
	public static void main(String[] args)
	{
		MobileCard mobileCard=new MobileCard(CardType.BIG,"1234", "xiao","1234", 234.4, 100,100);
		CommPackage a1=new CommPackage(mobileCard.getCommTime(),100);
		NetPackage a2=new NetPackage(mobileCard.getNetConsumm());
		System.out.println("��ǰ�ֻ�����Ϣ");
		System.out.println("������"+mobileCard.getCardType());
		System.out.println("����"+mobileCard.getCardNum());
		System.out.println("����"+mobileCard.getName());
		System.out.println("����"+mobileCard.getPassword());
		System.out.println("ͨ��ʱ��"+mobileCard.getCommTime());
		System.out.println("Ǯ"+mobileCard.getMoney());
		System.out.println("��������"+mobileCard.getNetConsumm());
		a1.CommAction(10, CardType.BIG);
		a1.show();
		a2.NetAction(10, CardType.BIG);
		a2.show();
		Consummer.showMessage();
		a2.NetAction(10, CardType.BIG);
		Consummer.showMessage();
		
		
		
		
		
	}
}
