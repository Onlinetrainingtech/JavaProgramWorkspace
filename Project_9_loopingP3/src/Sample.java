import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
	
		int fact=1,i,n;//variable declaration
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the n value is::");
		
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial Program is::"+fact);
		
		
		

	}

}
