
public class Sample {

	
	void arithmeticOperators()
	{
		int a=10,b=5;
		System.out.println("Addition is::"+(a+b));
		System.out.println("Module is::"+(a%b));
		System.out.println("Divided is::"+(a/b));
	}
	void comparisionOperator()
	{
		int a1=10,b1=20;
		System.out.println("Greater than >::"+(a1>b1));
		System.out.println("less than <::"+(a1<b1));
		System.out.println("Equal ==::"+(a1==b1));
		System.out.println("Not equal !=::"+(a1!=b1));
	}
	void logicalOperator()
	{
		int a2=10,b2=20;
		System.out.println("LogicalAND::"+((a2<b2)&&(b2>a2)));//True
		System.out.println("Logical OR::"+((a2>b2)||(b2>a2)));//True
		System.out.println("Logical NOT::"+(!(a2>b2)));//True
	}
	void bitwiseOperator()
	{
		int a=2,b=3;
		System.out.println("BitwiseAND::"+(a&b));
		System.out.println("BitwiseOR::"+(a|b));
		System.out.println("LeftShift::"+(a<<1));
		System.out.println("RightShift::"+(a>>1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample s1=new Sample();
		//s1.arithmeticOperators();
		//s1.comparisionOperator();
		//s1.logicalOperator();
		s1.bitwiseOperator();

	}

}
