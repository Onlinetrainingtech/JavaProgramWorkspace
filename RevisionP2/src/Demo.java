
public class Demo {
	public void function1()
	{
		System.out.println("Welcome to function-1");
	}
	
	public void function2()
	{
		System.out.println("Welcome to function-2");
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("This Main Function");
		
		Demo f1=new Demo();//Object Creation
		f1.function1();//To invoke the Object
		f1.function2();

	}

}
