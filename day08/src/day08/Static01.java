package day08;
public class Static01
{         
	int rollno;
	String name;
	static String college="AIT";
    
	Static01(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String[] args)
	{
		Static01 s1=new Static01(111,"kiran");
		Static01 s2=new Static01(222,"prajwal");
		s1.display();
		s2.display();
	}

}