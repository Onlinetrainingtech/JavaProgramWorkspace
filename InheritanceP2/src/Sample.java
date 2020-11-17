import java.util.Scanner;

class B
{
	int empid;
	String empname;
	Scanner sc1=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the empid is::");
		empid=sc1.nextInt();
	}
}
class D1 extends B
{
	void get2()
	{
		System.out.println("Enter the empname is::");
		empname=sc1.next();
	}
}
class D2 extends D1
{
	void get3()
	{
		System.out.println("Your Empid and empname is::"+empid+""+empname);
	}
}



public class Sample {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		f1.get1();
		f1.get2();
		f1.get3();
		

	}

}
