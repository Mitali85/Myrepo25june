package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoOnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> li=new ArrayList<String>();
		li.add("Tushar");
		li.add("Sona");
		li.add("Mona");
		System.out.println(li);
		
		System.out.println(li.size());
		System.out.println(li.isEmpty());  //false
		System.out.println(li.contains("Mona")); //true
		System.out.println(li.get(2));   //true
		
		
		System.out.println("List element traverssing..loop");
		for(int i=0;i<li.size();i++)
			System.out.println(li.get(i));
		
		System.out.println("List elelment traverrsing..for each loop");
		for(String ele:li)
			System.out.println(ele);
			
			
		System.out.println("Using iterator");
		Iterator<String> i=li.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}

}
