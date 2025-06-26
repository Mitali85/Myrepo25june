package CollectionFramework;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class DemoOnListClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> l=new LinkedList<String>();
		l.add("Apple");
		l.add("Mango");
		l.add("Orange");
		l.add("Graphs");
	    System.out.println(l);
		
		Vector<Float> v=new Vector<Float>();
		v.add(7.8f);
		v.add(8.9f);
		v.add(5.8f);
		v.add(6.9f);
		System.out.println(v);
		
		Stack<Integer> s=new Stack<Integer>();
		s.push(767);
		s.push(654);
		s.push(765);
		s.push(643);
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());

	}

}
