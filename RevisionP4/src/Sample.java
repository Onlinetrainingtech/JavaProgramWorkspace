
public class Sample {

	int b=200;//global variable
	void addEmployee(int empid,String empname)
	{
		int a=100;//local variable
		System.out.println("This is an addEmployee Module"+a);
		System.out.println("Your EmployeeId::"+empid+"Your employeename::"+empname);
	}
	void addCategory(int categoryid)
	{
		System.out.println("This is an addCategory"+b);
		System.out.println("Your category is::"+categoryid);
	}
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.addEmployee(100,"azar");
		s1.addCategory(201);

	}

}
