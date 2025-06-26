package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class DemoOnMapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		//Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(12, "Ram");
		m.put(13, "Sham");
		m.put(14, "Rakesh");
		m.put(15, "Mona");
		System.out.println(m);
		
		m.put(15, "Mitali");
		System.out.println(m);
		
		m.put(16, "Ram");
		System.out.println(m);

		m.put(null, "Sham"); //only one null key allowed
		System.out.println(m);
		
		m.put(null, "Ram");  //override
		System.out.println(m);
		
		m.put(12, null);
		System.out.println(m);
		
		m.put(13, null);
		System.out.println(m);
		
		System.out.println(m.get(null));
		System.out.println(m.size());
		System.out.println(m.get(14));
		
		m.replace(13, "Pratik");
		System.out.println(m);
		
		m.remove(null);
		System.out.println(m);
		
		System.out.println(m.size());
		System.out.println(m.isEmpty());  //false
		System.out.println(m.containsKey(15));  //true
		System.out.println(m.containsValue("Mitali")); //true
		
		m.clear();
		System.out.println(m.size());
		System.out.println(m.isEmpty()); //true
		System.out.println(m);
		
		
		
	}

}
