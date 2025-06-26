package ProgramOnException;

public class DemoThrow {
	
	void divideByZero(int a,int b)
	{
		if(b==0)
		{
			throw new ArithmeticException("can not divide by zero");
		}
		int res=a/b;
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoThrow obj=new DemoThrow();
		try
		{
			obj.divideByZero(8, 0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			
		}
		

	}

}
