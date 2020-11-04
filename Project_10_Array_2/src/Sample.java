import java.util.Scanner;

public class Sample {

	int empid[][]=new int[2][2];
	int i,j,n,m;
	Scanner sc1=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the row and column value::");
		n=sc1.nextInt();
		m=sc1.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Enter the empid is::");
				empid[i][j]=sc1.nextInt();
			}
		}
	}
	void get2()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Array value is::"+empid[i][j]);
			}
		}
	}
	public static void main(String[] args) {
		
		Sample d1=new Sample();
		d1.get1();
		d1.get2();

	}

}
