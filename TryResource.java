package ProgramOnException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TryResource {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\java Eclips\\CoreJava\\DemoFile.txt");  //file location path//file name
		FileWriter fw=null;
		try
		{
			fw=new FileWriter(f);
			fw.write("Welcome to java");
		    System.out.println("-----Success");
			
		}
		finally
		{
			fw.close();
			System.out.println("Always Execute");
		}
		//fw.write("Hello");

	}

}
