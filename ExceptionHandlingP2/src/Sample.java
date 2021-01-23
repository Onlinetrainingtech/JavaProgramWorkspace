
public class Sample {

	void get1()
	{
		try
		{
		//String name="mohamed";
		String name=null;
		System.out.println("length of the String::"+name.length());
		}
		catch(NullPointerException r)
		{
			System.out.println("Please check your output");
		}
	}
	
	
	public static void main(String[] args) {
		
		Sample d1=new Sample();
		d1.get1();

	}

}
