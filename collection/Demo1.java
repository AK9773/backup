package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		name.add("AJAY KUMAR");
		name.add("AMIT KUMAR");
		name.add("AMAN KUMAR");
		name.add("VISHAL KUMAR");
		name.add("ARYAN KUMAR");
		List<String> name2 = new ArrayList<String>();
		name2.add("KHUSHI");
		name2.add("GOURAV KUMAR");
		name2.add("ANUJ KUMAR");
		name2.add("SONU KUMAR");
		name2.add("YOGESH KUMAR");
		name2.add("LOKESH KUMAR");
		
		
//		name.remove(1);
		name.addAll(4, name2);
//		
//		System.out.println(name);
//		
//		name.set(4, "SHAGUN");
//		System.out.println(name);
//		
//		
//		System.out.println(name.get(4));
//		
//		System.out.println( name.indexOf("AMAN KUMAR"));
//		System.out.println( name.lastIndexOf("AMAN KUMAR"));
		
		
//		name.remove(4);
		
		
//		name.removeAll(name2);
//		System.out.println(name);
//		
//		
//		System.out.println(name.size());
//		
		

		List<Integer> numbers = new ArrayList<Integer>();
		
		
		for (int i = 0; i < 10; i++) {
			numbers.add(i);
		}
		for (Integer number : numbers) {
			System.out.print(number+", ");
		}
				

	}

}
