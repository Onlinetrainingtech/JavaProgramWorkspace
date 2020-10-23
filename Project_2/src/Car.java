
public class Car {

	void engine()
	{
		System.out.println("Hai..This is Engine..");
	}
	void breaks()
	{
		System.out.println("Hai..This is breaks..");
	}
	void speedmeter()
	{
		System.out.println("Hai..This is speedmeter..");
	}
	
	public static void main(String[] args) 
	{
		
		Car f1=new Car();//Object creation
		f1.engine();
		f1.breaks();
		f1.speedmeter();
          
	}

}
