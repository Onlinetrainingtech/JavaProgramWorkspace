import java.util.Scanner;

public class Sample {

	int age,sal,bns;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the age is::");
		age=sc.nextInt();
				
	}
	void cnd1()
	{
		if(age>=60)
		{
			System.out.println("Enter the salary is::");
			sal=sc.nextInt();
			if(sal>=20000)
			{
				bns=sal+500;
				System.out.println("Your salary is::"+bns);
			}
			else
			{
				bns=sal+1000;
				System.out.println("Your Salary is::"+bns);
			}
		}
		else
		{
			System.out.println("Your age is::low");
		}
	}
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();
		s1.cnd1();
   
	}

}
