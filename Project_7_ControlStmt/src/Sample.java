import java.util.Scanner;

public class Sample {

	int a,b;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the a and b value is::");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	void cnd()
	{
		if(a%b==0)
		{
			System.out.println("Even"+a);
		}
		else
		{
			System.out.println("Odd"+a);
		}
	}
	void cnd2()
	{
		if(a>b)
		{
			System.out.println("A is big");
		}
		else
		{
			System.out.println("B is big");
		}
	}
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();
		//s1.cnd();
		s1.cnd2();

	}

}
