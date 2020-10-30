import java.util.Scanner;

public class Demo {

	int exp;
	Scanner sc1=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the exp::");
		exp=sc1.nextInt();
		switch(exp)
		{
		case 1:
			System.out.println("case-1");
			break;
		case 2:
			System.out.println("case-2");
			break;
		case 3:
			System.out.println("case-3");
			break;
	    default:
	    	System.out.println("deafult case process");
	    	break;
			
		}
	}
	public static void main(String[] args) {
		
		
		Demo f1=new Demo();
	    f1.get1();
		
		

	}

}
