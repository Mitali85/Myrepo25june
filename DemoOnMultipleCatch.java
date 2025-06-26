package ProgramOnException;

public class DemoOnMultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5]; //0 to 4
		//a[6]=78;  //unchecked exception 
        
		try
		{
			a[6]=78;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmaticException...."+ae);
		}
		catch(NullPointerException ne)
		{
			System.out.println("NullPointer"+ne);
			
		}
		catch(ArrayIndexOutOfBoundsException arre)
		{
			System.out.println("ArrayException"+arre);
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
		}
		System.out.println(a[4]);  //after handal the exception execute remain code  
	}

}
