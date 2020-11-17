import java.util.ArrayDeque;

public class Sample {

	ArrayDeque<Integer>k1=new ArrayDeque<>();
	void get1()
	{
		k1.add(1001);
		k1.addFirst(2001);
		k1.add(1002);
		k1.add(1003);
		k1.add(1004);
		System.out.println("Your data is::"+k1);
	}
	public static void main(String[] args) {
		
		Sample g1=new Sample();
		g1.get1();

	}

}
