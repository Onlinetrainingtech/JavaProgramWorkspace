
public class Sample {

	String uname,pass;
	void input(String uname,String pass)
	{
		this.uname=uname;
		this.pass=pass;
		System.out.println("Your UserName is::"+uname+""+pass);
	}
	void display()
	{
		System.out.println("Inherit data is::"+uname+""+pass);
	}
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.input("admin","admin");
		s1.display();

	}

}
