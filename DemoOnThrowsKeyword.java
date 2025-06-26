package ProgramOnException;

import java.io.IOException;

public class DemoOnThrowsKeyword {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Enter a character");
		char c=(char)System.in.read();  //checked exception--using throws
		System.out.println("Entered character is "+c);
	} 

}
