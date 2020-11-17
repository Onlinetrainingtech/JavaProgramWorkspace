import java.util.HashMap;
import java.util.Hashtable;

public class Sample {

	//HashMap<Integer,String>m1=new HashMap<>();
	Hashtable<Integer,String>m1=new Hashtable<>();
	void get1()
	{
		m1.put(1001,"mohamed");
		m1.put(1002,"azar");
		m1.put(1003,"raja");
		
		System.out.println("To display the data is::"+m1);
		System.out.println("Total size is::"+m1.size());
		System.out.println("To know the data is::"+m1.containsKey(1001));
		System.out.println("To Remove the data is::"+m1.remove(1002));
	}
	
	public static void main(String[] args) {
		
		Sample f1=new Sample();
		f1.get1();

	}

}
