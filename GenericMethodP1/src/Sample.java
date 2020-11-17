class Demo
{
	public <M> M test(M t)//public int test(int t)
	{
		return t;
	}
}



public class Sample {

	public static void main(String[] args) {
		
		Demo g=new Demo();
		g.test(100);
		g.test("azar");
		g.test(2.4);
		

	}

}
