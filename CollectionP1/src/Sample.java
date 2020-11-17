import java.util.HashSet;
import java.util.TreeSet;

public class Sample {

	//HashSet<String>list1=new HashSet<>();
	TreeSet<String>list1=new TreeSet<>();
	void get1()
	{
		list1.add("mohamed");
		list1.add("azar");
		list1.add("raja");
		list1.add("raja");//avoid the duplicated values
		System.out.println("Your data is::"+list1);
		System.out.println("Your Size is::"+list1.size());
		System.out.println("You have remove the data::"+list1.remove("azar"));
		System.out.println("After removing::"+list1.size());
		System.out.println("Searching the data is::"+list1.contains("azar"));
	}
	
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();

	}

}
