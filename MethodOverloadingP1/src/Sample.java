
public class Sample {

	void cal(int a1,int b1)
	{
		System.out.println("First function::"+a1+""+b1);
	}
	void cal(String uname)
	{
		System.out.println("Second function::"+uname);
	}
	
	public static void main(String[] args) {
		
		Sample d1=new Sample();
		d1.cal(20,30);
		d1.cal("admin");

	}

}
