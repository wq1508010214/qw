package wq;

public class Wq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("汪强",20 , "一本");		s1.Show();
		Undergraduate u1=new Undergraduate("汪强", 20,"一本", "软件");		u1.Show();
		Graduate g1=new Graduate("汪强", 20, "研究生", "安卓");		g1.Show();
	}

}
class Student {
	public String name;
	public int age;
	public String education;
	public Student(String n,int a,String e) {
		name=n;		age=a;		education = e;
	}
	void Show(){
		System.out.println("姓名："+name+"\n年龄："+age+"\n学历："+education);
	}
}
class Undergraduate extends Student{
	public Undergraduate(String n, int a, String e,String s) {
		super(n, a, e);		specialty=s;
	}
	private String specialty;
	void Show(){
		System.out.println("姓名："+name+"\n年龄："+age+"\n学历："+education);
		System.out.println("专业："+specialty);
	}
}
class Graduate extends Student{
	public Graduate(String n, int a, String e,String d) {
		super(n, a, e);		direction=d;
	}
	private String direction;
	void Show(){
		System.out.println("姓名："+name+"\n年龄："+age+"\n学历："+education);
		System.out.println("研究方向："+direction);
	}

}
