package p1;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Account a1 = new Account("a",101, 2500);
		Account a2 = new Account("b",102, 12000);
		Account a3 = new Account("c",103, 32000);
		Account a4 = new Account("a",101, 2500);
		
		Set<Account> set = new TreeSet<Account>();
		
		set.add(a1);
		set.add(a2);
		set.add(a3);
		set.add(a4);
		
		display(set);
		
		System.out.println(" --------------");
		
		List<Account> accountsList = new ArrayList<Account>();
		accountsList.addAll(set);
		
		Collections.sort(accountsList, new SortByID());
		
		display(accountsList);
		
		
	}
	
	public static void display(Collection<Account> set)
	{
		for (Account account : set) {
			System.out.println(account);
		}
	}
}








