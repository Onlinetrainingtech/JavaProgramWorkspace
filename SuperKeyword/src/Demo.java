class B1
{
	int a=100;
	void get1()
	{
		System.out.println("Baseclass data is::"+a);
	}
}
class D1 extends B1
{
	void get2()
	{
		int a=200;
		System.out.println("Dervied class data is::"+super.a);
	}
}



public class Demo {

	public static void main(String[] args) {
		
		D1 f1=new D1();
		f1.get1();
		f1.get2();

	}

}
