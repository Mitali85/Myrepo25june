package CollectionFramework;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class DemoOnSortedSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedSet<Integer> st=new TreeSet<Integer>();
		st.add(89);
		st.add(87);
		st.add(650);
		st.add(67);
		System.out.println(st);
		
		TreeSet<Integer> t=new TreeSet<Integer>();  //ascending order sorting
		t.add(89);
		t.add(34);
		t.add(12);
		t.add(45);
		System.out.println(t);
		
		Iterator<Integer> i=t.descendingIterator();  //descending order sorting
		while(i.hasNext())
		{
			System.out.print(i.next()+ " ");
		}

	}

}
