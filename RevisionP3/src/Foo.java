
public class Foo {

	String productname="apple";//global variable or class or instance variable
	void get1()
	{
       int productid=1001;//local variable	
       System.out.println("Your ProductId is::"+productid+"YourProductName"+productname);
       //System.out.println("Your ProductName is::"+productname);
	}
	void get2()
	{
		
		System.out.println("Your ProductName::"+productname);
	}
	
	public static void main(String[] args) {
		
		Foo f1=new Foo();//Object Creation
		f1.get1();
		f1.get2();

	}

}
