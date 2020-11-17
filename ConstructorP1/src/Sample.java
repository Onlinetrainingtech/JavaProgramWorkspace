
public class Sample {

	Sample()//default Constructor
	{
		System.out.println("default cons..");
	}
	Sample(String name)
	{
		System.out.println("Parameter cons.."+name);
	}
	
	
	public static void main(String[] args) {
		
		new Sample();//default cons
		new Sample("azar");//param cons..

	}

}
