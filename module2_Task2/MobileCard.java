package module2_Task2;

public class MobileCard {
	public MobileCard(CardType Type,String CardNum,String Name,String Password,double Money,int CommTime,int NetConsumm )
	{
		this.Type=Type;
		this.CardNum=CardNum;
		this.Name=Name;
		this.Password=Password;
		this.Money=Money;
		this.CommTime=CommTime;
		this.NetConsumm=NetConsumm;
	}
	private CardType Type;
	private String CardNum;
	private String Name;
	private String Password;
	private double Money;//��ǰ���
	private int CommTime;//ͨ��ʱ��
	private int NetConsumm;//��������
	public  CardType	 getCardType()
	{
		return Type	;
	}
	public void setCardType(CardType T)
	{	
		Type=T;		
	}
	
	public  String	getCardNum()
	{
		return CardNum	;
	}
	public void setCardNum(String T)
	{	
		CardNum=T;		
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String n)
	{
		Name=n;
	}
	public double getMoney()
	{
		return Money;
	}
	public void setMoney(double m)
	{
		Money=m;
	}
	public String getPassword()
	{
		return Password;
	}
	public void setPassword(String t)
	{
		Password=t;
	}
	public int getCommTime()
	{
		return CommTime;
	}
	public void setCommTime(int t)
	{
		CommTime=t;
	}
	public int getNetConsumm()
	{
		return NetConsumm;
	}
	public void setNetConsumm(int t)
	{
		NetConsumm=t;
	}
	public void show()
	{
		System.out.println("���ţ�"+CardNum+"�û�����"+Name+"��ǰ���"+Money);
	}
}
