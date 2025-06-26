package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DemoOnCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l=new ArrayList<String>();
		l.add("Java");
		l.add(".net");
		l.add("Testing");
		l.add("Python");
		System.out.println(l.size());
		System.out.println(l);

		//more members get add
		Collections.addAll(l,"Data Science","Full Stack Python","Machine Learning");
		
		System.out.println(l);
		System.out.println(l.size());
		
        Collections.sort(l);
        System.out.println(l);
        
        Collections.reverse(l);
        System.out.println(l);
	}

}
