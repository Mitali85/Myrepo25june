package ProgramOnException;

public class DemoOnNestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=null;
	  //System.out.println(s.length());     //exception
		try
		{
			//System.out.println(s.length());
			try
			{
				int a=4,b=0;
				int res=a/b;
				try
				{
					int arr[]=new int[5];
					arr[6]=78;
				}
				catch(NullPointerException ne)
				{
					System.out.println("null..."+ne);
				}
			}
			catch(ArrayIndexOutOfBoundsException arr) 
			{
			      System.out.println("arr...."+arr);	
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmatic..."+ae);
		}
		

	}

}
