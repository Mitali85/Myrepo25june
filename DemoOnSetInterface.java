package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class DemoOnSetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s= new HashSet<Integer>(); 
		//HashSet<Integer> s= new HashSet<Integer>(); 
		s.add(788);
		s.add(890);
		s.add(876);
		s.add(870);
		s.add(873);
		System.out.println(s);
		System.out.println(s.size());
		
		s.add(000);
		System.out.println(s);
		System.out.println(s.size());
		
		s.add(890);
		System.out.println(s);
		System.out.println(s.contains(890));
		s.remove(788);
		System.out.println(s);
		System.out.println(s.isEmpty());
		System.out.println(s.hashCode());
		s.clear();
		System.out.println(s);

	}

}
