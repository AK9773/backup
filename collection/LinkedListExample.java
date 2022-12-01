package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> name= new LinkedList<String>();
		name.add("Aman");
		name.add("Ajay");
		name.add("Gaurav");
		name.add("Vishal");
		name.add("Amit");
		name.add("Anika");
		name.add("Sarthak");
		name.add("Arun");
		
//		System.out.println(name);
		
//		name.addFirst("Aerav");
//		name.addLast("Kumar");
//		name.removeFirst();
		
		for(String s: name) {
			System.out.println(s);
		}
		
		Iterator<String> i= name.iterator();
		
		while (i.hasNext()) {
			String string = (String) i.next();
			if (string.startsWith("A")) {
				System.out.println(string);
			}
			else {
				i.remove();
			}
		}
		
		
		System.out.println(name);

	}

}
