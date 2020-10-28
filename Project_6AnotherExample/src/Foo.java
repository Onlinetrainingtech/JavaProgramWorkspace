import java.util.Scanner;

public class Foo {

	//global variable
	int productid,productprice;
	String productname;
	Scanner sc1=new Scanner(System.in);
	void addProduct()
	{
		System.out.println("Enter the productdetails..");
		productid=sc1.nextInt();
		productprice=sc1.nextInt();
		productname=sc1.next();
	}
	void viewProduct()
	{
		System.out.println("Your Product details.."+productid+""+productprice+""+productname);
	}
	public static void main(String[] args) {
		
		Foo f1=new Foo();
		f1.addProduct();
		f1.viewProduct();

	}

}
