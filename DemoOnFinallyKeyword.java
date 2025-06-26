package ProgramOnException;

public class DemoOnFinallyKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=8;
		int b=7;
		int res=0;
		 
		try
		{
			res=a/b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		finally
		{
			System.out.println("It will always execute");
		}
		System.out.println(res);

	}

}
