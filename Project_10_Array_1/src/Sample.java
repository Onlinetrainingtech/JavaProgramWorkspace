import java.util.Scanner;

public class Sample {

	int empid[]=new int[5];
	int i,n;
	Scanner sc1=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n value::");
		n=sc1.nextInt();
		for(i=0;i<=n;i++)
		{
			System.out.println("Enter the ArrayValue is::");
			empid[i]=sc1.nextInt();
		}
	}
	void get2()
	{
		for(i=0;i<=n;i++)
		{
			System.out.println("Array value is::"+empid[i]);
		}
	}
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();
		s1.get2();

	}

}
