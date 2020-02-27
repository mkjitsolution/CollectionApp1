package p1;

import java.util.Comparator;

public class SortByID implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
		return o1.getAccountNumber() - o2.getAccountNumber();
	}
	
}
