package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {

		HashSet<String> name = new HashSet<String>();
//		System.out.println(name.add("Aman"));
		name.add("Sarthak");
		name.add("Anika");
		name.add("Aman");
		name.add("Aman");
		name.add("Ajay");
		name.add("Arun");
		name.add("Aaryan");
		name.add("Khushi");

		System.out.println(name);
		System.out.println(name.getClass().getSimpleName());

		ArrayList<String> name1 = new ArrayList<String>(name);
		System.out.println(name1.getClass().getSimpleName());
	}

}
