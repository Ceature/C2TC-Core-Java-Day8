package day08;
class Demo{
	   Demo()
	   {
		 System.out.println("hello a");
	   }
	   Demo(int x)
	   {
		   this();
		   System.out.print(x);
	   }
}
public class Keyinvoke02 {

	public static void main(String[] args) {
       Demo a=new Demo(10);
       

	}

}