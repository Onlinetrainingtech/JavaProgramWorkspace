import java.util.Scanner;

public class Sample {

	int i,n;
	Scanner sc1=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n value is::");
		n=sc1.nextInt();
		
	}
	void get2()
	{
		for(i=0;i<=n;i++)
		{
			System.out.println("I value is::"+i);
		}
	}
	void oddoreven()
	{
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even"+i);
			}
			else
			{
				System.out.println("Odd"+i);
			}
		}
	}
	public static void main(String[] args) {
		

		Sample s1=new Sample();
		s1.get1();
		s1.get2();
		s1.oddoreven();
	}

}
