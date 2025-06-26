package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
	int rollno;
	String name;
	float marks;
	int age;
	
	Student(int rollno,String name,float marks,int age) {

	{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
		this.age=age;
	}
}
	
	
	@Override
	public int compareTo(Student s)
	{
		if(age==s.age)
			return 0;
		else if(age>s.age)
			return 1;
		else
			return -1; 
	}
	
}

public class DemoOnComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(11,"Ram",56.8f,12);
		Student s2=new Student(12,"Ramesh",56.8f,22);
		Student s3=new Student(13,"Rekha",58.8f,32);
		
		ArrayList<Student> li=new ArrayList<Student>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		
		Collections.sort(li);
		
		for(Student s:li)
		{
			System.out.println(s.age+ " "+s.name);
		}
		
		

	}
}
