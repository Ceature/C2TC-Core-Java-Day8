package day08;
public class Staticblock
{
     int rollno;
     String name;
     static String college="AIT";
     Staticblock(int r,String n)
     {
    	 rollno=r;
    	  name=n;
     }
     static
     {
    	college="acharya";
     }
     void display()
     {
    	 System.out.println(rollno+" "+name+" "+college);
     }
	public static void main(String[] args)
	{
		Staticblock s1=new Staticblock(111,"abdul");
		Staticblock s2=new Staticblock(222,"vikash");
		s1.display();
		s2.display();

	}

}