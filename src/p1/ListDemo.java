package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List list = new ArrayList<>();

		list.add(new Exception());
		list.add(new Test());
		list.add(new Account());
		list.add(10);
		list.add(5.6f);
		list.add(true);

		System.out.println("list " + list);
		System.out.println(list.get(4));

		System.out.println(list.size());

		// --- Way 1
		System.out.println(" ---- Approach 1 --------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			//
		}

		// Way - 2
		System.out.println(" ---- Approach 2 --------");
		for (Object object : list) {
			System.out.println(object);
		}

		// Way - 3 based on Iterator
		Iterator itr = list.iterator();
		System.out.println(" ---- Approach 3 --------");
		
		while(itr.hasNext())
		{
			Object obj = itr.next();
			System.out.println(obj.toString());
		}
		
		

	}
}






//  public boolean add(Object o);
// public void add(int, E);
