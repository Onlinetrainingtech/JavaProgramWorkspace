
public class Employee {

	void addEmployee(int empid,String empname)//Argument passing
	{
		System.out.println("Your Employee Information::"+empid+""+empname);
	}
	void addCategory(int categoryid,String cname)
	{
		System.out.println("Your EmployeeCategory::"+categoryid+""+cname);
	}
	
	public static void main(String[] args) {
		
    
		Employee e1=new Employee();
		e1.addEmployee(1001,"azar");
		e1.addCategory(2001,"IT");
		
	}

}
