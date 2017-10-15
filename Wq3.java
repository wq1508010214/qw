package wq1;

public class Wq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepositAccount saver = new DepositAccount(1234567890, "zhangsan", 0 , 5000 , 0.023);
		saver.In(2000);
		saver.Show();
		saver.ShowLixi();
	}
}
class DepositAccount
{
	private int id;
	private String name;
	private double money;
	private double money2;
	private double lilv;
	public DepositAccount(int i,String n,double m,double m2,double l)
	{
		id=i;
		name=n;
		money=m;
		money2=m2;
		lilv=l;
	}
	void In(double m)
	{
		money+=m;		
	}
	void Show()
	{
		System.out.println("账户名："+id);
		System.out.println("姓名："+name);
		System.out.println("余额："+money);
		System.out.println("定期存款："+money2);
	}
	void ShowLixi()
	{
		System.out.println("年利息："+(lilv*money2));
		System.out.println("月利息："+(lilv*money2/12));
	}

}
