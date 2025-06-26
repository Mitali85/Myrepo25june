package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 
{
	int rollno;
	String name;
	float marks;
	int age;
	
	Student1(int rollno,String name,float marks,int age)
	{

	
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
		this.age=age;
	}
}
	
class AgeCompare implements Comparator<Student1>
{

	@Override
	public int compare(Student1 s1, Student1 s2) 
	{
		// TODO Auto-generated method stub
		if(s1.age==s2.age)
			return 0;
		else if(s1.age >s2.age)
			return 1;
		else
		    return -1;
		
	}
	
}
class NameCompare implements Comparator<Student1>
{

	@Override
	public int compare(Student1 s1, Student1 s2) 
	{
		// TODO Auto-generated method stub
		return s1.name.compareTo(s2.name);
	}
	
}

public class DemoOnComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 s1=new Student1(11,"Ram",67.7f,23);
		Student1 s2=new Student1(12,"Vinay",77.7f,33);
		Student1 s3=new Student1(13,"Sham",88.7f,28);
		
		List<Student1> li=new ArrayList<Student1>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		
		System.out.println("Comparison-----based on age");
		AgeCompare obj=new AgeCompare();
		Collections.sort(li,obj);
		for(Student1 s:li)
		{
			System.out.println(s.age+ " "+s.name);
			
		}
		
		
		System.out.println("Comparison-----based on name");
		NameCompare obj1=new NameCompare();
		Collections.sort(li,obj1);
		for(Student1 s:li)
		{
			System.out.println(s.age+ " "+s.name);
		
		

	}

   }
  }

