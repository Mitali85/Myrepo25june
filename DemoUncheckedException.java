package ProgramOnException;

public class DemoUncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		//System.out.println(s.length()); //unchecked exception
		
		try
		{
			//risky code---technically impossible code
			System.out.println(s.length());
		}
		catch(NullPointerException ne)
		{
			//block--to handle the exception
			System.out.println(ne);
		}
		System.out.println("Hello");
	}

}

