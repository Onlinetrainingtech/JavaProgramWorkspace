class Vehicle
{
	void run()
	{
		System.out.println("Vechicle class");
	}
}
class Bike2 extends Vehicle
{
	void run()
	{
		System.out.println("Bike class");
	}
}

public class Demo {

	public static void main(String[] args) {
		
		Bike2 f1=new Bike2();
		f1.run();
		//f1.run();

	}

}
