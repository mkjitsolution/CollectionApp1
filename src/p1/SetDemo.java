package p1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		/*
		 * Set<Integer> set = new HashSet<Integer>(); set.add(50); set.add(5504);
		 * set.add(450); set.add(150); set.add(50); set.add(50);
		 * 
		 * 
		 * System.out.println(set); System.out.println(set.size());
		 * 
		 */
		

		Map map = new HashMap();
		
		map.put(1, new Exception());
		map.put(1, 11);
		map.put(2, true);
		map.put(3, new Account());
		map.put(new Test(), new Exception());
		map.put(4, true);
		
		
		System.out.println(map);
		
		for(Object o:map.keySet())
		{
			System.out.println(o.toString()+" - "+map.get(o));
		}
		
		
		
		
	}

}





