interface B1
{
	int a=100;
    void get1();
}
interface B2 extends B1
{
	void get2();
}
class Foo implements B2
{
	public void get1()
	{
		System.out.println("This is interface method-1"+a);
	}
	public void get2()
	{
		System.out.println("This is interface method-2");
	}
}

public class Sample {

	public static void main(String[] args) {
		
		Foo f1=new Foo();
		f1.get1();
		f1.get2();

	}

}
