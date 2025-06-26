package ProgramOnException;

class DivideByZeroException extends Exception
{
	DivideByZeroException(String msg)
	{
	    super(msg);	
	}
}

public class DemoOnCustomException {
	
	static void dividebyzero(int a,int b)throws DivideByZeroException
	{
		if(b==0)
		{
			throw new DivideByZeroException("Can not divide by zero");
		}
		int res=a/b;
		System.out.println(res);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			DemoOnCustomException.dividebyzero(8,0);
			
		}
		catch(DivideByZeroException msg)
		{
			System.out.println(msg);
		}

	}

}
