package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		name.add("AJAY KUMAR");
		name.add("AMIT KUMAR");
		name.add("AMIT KUMAR");
		name.add("AMAN KUMAR");
		name.add("AMAN KUMAR");
		name.add("VISHAL KUMAR");
		name.add("VISHAL KUMAR");
		name.add("ARYAN KUMAR");
		
		TreeSet<String> name1= new TreeSet<String>(name);
		System.out.println(name1);
		

	}

}
