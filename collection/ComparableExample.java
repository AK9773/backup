package collection;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparable implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
	}

}

public class ComparableExample {
	public static void main(String[] args) {

		TreeSet<String> name= new TreeSet<String>(new MyComparable());
		name.add("Aman");
		name.add("Ajay");
		name.add("Sarthak");
		name.add("Anika");
		name.add("Shagun");
		name.add("Vishal");
		
		System.out.println(name);
	}
}
