package ProgramOnString;

public class DemoMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="welcome to java";
		System.out.println(s1);
		
		String s2="hello";
		System.out.println(s2);
		
		String s3="hello";
		System.out.println(s3);
		
		String s4="apple";
		System.out.println(s4);
		
		System.out.println(s1.compareTo(s2)); 
		
		System.out.println(s2.compareTo(s1));

	    System.out.println(s2.compareTo(s3));
	    
	    System.out.println(s2.compareTo(s4));
	    
	    System.out.println(s1.concat("hello"));
	    
	    System.out.println(s2.equals(s3));
	    
	    System.out.println(s2.equals(s4));

	    System.out.println(s1.substring(7));
	    
	    System.out.println(s1.substring(7,12));  //end index exclude
	    
	}

}
