
public class Product {

	String productname="apple";//global variable or class or instance variable
	void process()
	{
		int productid=1001;//declaration//local variable
		System.out.println("Your ProductId"+productid);
	}
	void display()
	{
		System.out.println("Your ProductName"+productname);
	}
	
	
	public static void main(String[] args) {
		
		
		Product p1=new Product();
		p1.process();
		p1.display();
		

	}

}
