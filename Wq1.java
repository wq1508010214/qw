package wq;

public class Wq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("��ǿ",20 , "һ��");		s1.Show();
		Undergraduate u1=new Undergraduate("��ǿ", 20,"һ��", "���");		u1.Show();
		Graduate g1=new Graduate("��ǿ", 20, "�о���", "��׿");		g1.Show();
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
		System.out.println("������"+name+"\n���䣺"+age+"\nѧ����"+education);
	}
}
class Undergraduate extends Student{
	public Undergraduate(String n, int a, String e,String s) {
		super(n, a, e);		specialty=s;
	}
	private String specialty;
	void Show(){
		System.out.println("������"+name+"\n���䣺"+age+"\nѧ����"+education);
		System.out.println("רҵ��"+specialty);
	}
}
class Graduate extends Student{
	public Graduate(String n, int a, String e,String d) {
		super(n, a, e);		direction=d;
	}
	private String direction;
	void Show(){
		System.out.println("������"+name+"\n���䣺"+age+"\nѧ����"+education);
		System.out.println("�о�����"+direction);
	}

}
