import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		int i,n;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the n value is::");
		n=s1.nextInt();
		i=0;
		while(i<=n)
		{
			System.out.println("I value is::"+i);
			i=i+1;//i++
		}
	}

}
