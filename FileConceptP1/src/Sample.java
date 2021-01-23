import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample {

	
	void writeProcess()
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("D:\\f1.txt");
			String name="haihowareyou";
			byte s[]=name.getBytes();
			fos.write(s);
			System.out.println("Inserted..");
		}
		catch(Exception t)
		{
			System.out.println(t);
		}
	}
	void readProcess() throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("D:\\f1.txt");
			FileOutputStream fos=new FileOutputStream("D:\\f2.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				//System.out.print((char)i);
				fos.write((byte)i);
			}
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		
		Sample f1=new Sample();
		//f1.writeProcess();
		f1.readProcess();

		
	}

}
