import java.util.ArrayList;

public class Demo {

	ArrayList<String>list1=new ArrayList<>();
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
		
		Demo f1=new Demo();
		f1.get1();

	}

}
