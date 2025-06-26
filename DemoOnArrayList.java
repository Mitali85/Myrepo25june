package CollectionFramework;

import java.util.ArrayList;

public class DemoOnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList li=new ArrayList();  //non-generic collection
		
		li.add(23);
		li.add("Sachin");
		li.add(5.8f);
		li.add('M');
		
		System.out.println(li);

		li.add(23);
		System.out.println(li);
		
		ArrayList<Integer> a=new ArrayList<Integer>();   //generic collection
		
		a.add(45);
		//a.add("String);
		a.add(89);
		a.add(67);
		System.out.println(a);
		
		a.add(2,49);
		System.out.println(a);
		
		System.out.println(a.size()); //4
		System.out.println(a.get(3)); //67
		System.out.println(a.contains(45)); //true  //list main 45 hai ki nhi check krne ke liye
		
		a.remove(1);
		System.out.println(a);
		
		a.addAll(li);
		System.out.println(a);
		
		a.removeAll(li);
		System.out.println(a);
		
		System.out.println(a.equals(li));  //false
		System.out.println(a.hashCode());
		
		
		a.clear();
		System.out.println(a);
		System.out.println(a.isEmpty());  //true
		
	}

}
