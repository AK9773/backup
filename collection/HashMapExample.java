package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// key must be unique value may or may not unique
		HashMap<Integer, String> studentInfo= new HashMap<Integer, String>();
		studentInfo.put(1, "Aman Kumar");
		studentInfo.put(8, "Sarthak Daksha");
		studentInfo.put(5, "Gaurav Kumar");
		studentInfo.put(3, "Amit Kumar");
		studentInfo.put(9, "Anika Daksha");
		studentInfo.put(6, "Arun Kumar");
		studentInfo.put(4, "Aryan Kumar");
		studentInfo.put(7, "Vishal Kumar");
		studentInfo.put(2, "Ajay Kumar");
		
		System.out.println(studentInfo );
		
		//Search Operation	
		if(studentInfo.containsKey(10)) {
			System.out.println("Key is present");
		}else {
			System.out.println("Key is not present");
		}
		
		System.out.println(studentInfo.get(1));
		
		//Iteration
		for(Map.Entry<Integer,String> e : studentInfo.entrySet()) {
			System.out.print(e.getKey()+": ");
			System.out.print(e.getValue());
			System.out.println();
		}
		
		Set<Integer> keys = studentInfo.keySet();
		for (Integer key : keys) {
			System.out.print(key+": ");	
		}
		System.out.println();
		studentInfo.remove(9);
		System.out.println(studentInfo);
		
	}

}
