import java.io.FileInputStream;

public class Sample {

	void get1()
	{
		try
		{
			FileInputStream fis=new FileInputStream("D:\\f1.txt");
		}
		catch(Exception t)
		{
			System.out.println(t);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
