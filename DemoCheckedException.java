package ProgramOnException;

public class DemoCheckedException {
	
	static char c; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a character");
		//char c='t';
		//char c=(char)Sysem.in.read();  //checked exception
		
		try
		{
			c=(char)System.in.read(); //checked exception
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Enered character is-->+c");

	}

}
