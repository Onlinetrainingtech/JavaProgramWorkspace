
public class Sample {

	void get1()
	{
		try
		{
		int a=10/0;
		System.out.println("Your Value is::"+a);
		}
		catch(ArithmeticException t)
		{
			System.out.println("Please check your Application"+t);
		}
		finally
		{
			System.out.println("This is finally block");
		}
	}
	void get2()
	{
		int productid=1001;
		System.out.println("Your ProductId is::"+productid);
	}
	public static void main(String[] args) {
		
		Sample d1=new Sample();
		d1.get1();
		d1.get2();

	}

}
