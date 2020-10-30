import java.util.Scanner;

public class Sample {

	int m1,m2,m3,tot;
	Scanner sc1=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the marks::");
		m1=sc1.nextInt();
		m2=sc1.nextInt();
		m3=sc1.nextInt();
		tot=m1+m2+m3;
	}
	void cnd1()
	{
		if(tot>900)
		{
			System.out.println("Grade-A");
		}
		else if((tot>700)&&(tot<=600))
		{
			System.out.println("Grade-B");
		}
		else if((tot>500)&&(tot<=800))
		{
			System.out.println("Grade-C");
		}
		else
		{
			System.out.println("Grade-D");
		}
	}
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();
		s1.cnd1();

	}

}
