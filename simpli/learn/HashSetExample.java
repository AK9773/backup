package simpli.learn;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		
		HashSet h= new HashSet();
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(5);
		h.add("Aman");
		h.add("AK");
		h.add(null);
		System.out.println(h.add(1));
		
		System.out.println(h);
	}

}
