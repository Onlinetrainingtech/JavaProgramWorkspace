import java.util.Scanner;

public class Demo {

	int a,b,c;
	String name;
	Scanner s1=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the a value::");
		a=s1.nextInt();
		System.out.println("Enter the b value::");
		b=s1.nextInt();
		System.out.println("Enter the name is::");
		name=s1.next();
		
	}
	void display()
	{
		c=a*b;
		System.out.println("Your Result is::"+c);
		System.out.println("Your name is::"+name);
	}
	
	public static void main(String[] args) {
		
		Demo d1=new Demo();
		d1.input();
		d1.display();

	}

}
