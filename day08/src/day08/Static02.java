package day08;
public class Static02
{         
	int rollno;
	String name;
	static String college="AIT";
    
	Static02(int r,String n)
	{
		rollno=r;
		name=n;
	}
	static void change()
	{
		college="acharya";
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String[] args)
	{
		Static02 s1=new Static02(111,"kiran");
		Static02 s2=new Static02(222,"prajwal");
		change();
		s1.display();
		s2.display();
	}

}
