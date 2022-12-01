package string;

import org.omg.CORBA.portable.ValueOutputStream;

public class StringMethod {

	public static void main(String[] args) {
		String str = "Welcome to Java programming language";

		// Length of a String
		int length = str.length();
		System.out.println(length);

		// for loop using charAt() method
		for (int i = 0; i < length; i++) {
			System.out.print(str.charAt(i) + " ");
		}

		char[] data = { 'w', 'e', 'l', 'c', 'o', 'm', 'e' };
		String str2 = "";

		// String from an Array of character using copyValueOf method
		str2 = str2.copyValueOf(data);
		System.out.println("\n" + str2);

		// String from an Array of character using copyValueOf method starting from
		// index 2 and having 3 character
		str2 = str2.copyValueOf(data, 2, 3);
		System.out.println(str2);

		// check given string ends with e or not
		System.out.println(str.endsWith("e"));

		// converting string to upper case
		String str3 = str.toUpperCase();
		System.out.println(str3);

		// compare string using equals ignore case method
		System.out.println(str.equalsIgnoreCase(str3));

		char[] str4 = new char[20];
		str.getChars(2, 17, str4, 0);
		// first index inclusive and last index exclusive
		System.out.println(str4);

		System.out.println(str.hashCode());

		System.out.println(str.indexOf('J'));
		System.out.println(str.indexOf('o', 8));
		System.out.println(str.indexOf("programming"));

		System.out.println(str.lastIndexOf('e'));

		// matches method
		System.out.println(str.matches("(.*)programming(.*)"));
		System.out.println(str.matches("Welcome(.*)"));
		System.out.println(str.matches("(.*)language"));
		System.out.println(str.matches("(.*)Welcome(.*)"));
		System.out.println(str.matches("language"));

		// regionMatches method
		String str5 = new String("Java");
		System.out.println(str.regionMatches(true, 11, str5, 0, 4));

		// System.out.println(str.replace(' ', '@'));
		System.out.println(str.replace('o', 'O'));

		System.out.println(str.replaceAll("Java", "Python"));

		String str6 = "Welcome to Java programming language. Java is platform independent.";
		System.out.println(str6.replaceFirst("Java", "Python"));

		System.out.println("\nString after split:");
		for (String str7 : str.split(" ", 0)) {
			System.out.print(str7 + "       ");
		}

		System.out.println("\nString after split:");
		for (String str7 : str.split(" ")) {
			System.out.print(str7 + "       ");
		}

		System.out.println("\nString after split:");
		for (String str7 : str.split(" ", 2)) {
			System.out.print(str7 + "       ");
		}

		System.out.println("\nString after split:");
		for (String str7 : str.split(" ", 3)) {
			System.out.print(str7 + "       ");
		}

		System.out.println("\n" + str.startsWith("W"));

		
		//creating substring using starting index and ending index from a given string
		System.out.println(str.substring(0, 7));

		char[] array = str.toCharArray();
		System.out.println(array);
		
		String string = str.toString();
		System.out.println(string);
		
		String str7 ="";
		str7 =str7.copyValueOf(array);
		System.out.println(str7);
		
		
		//trim method to remove space from starting and end 
		String firstName="   Aman   ";
		String lastname="   Kumar   ";
		String name = firstName.trim().concat(" "+lastname.trim());
		System.out.println(name);
		
		
		//valueOf method returns String of given datatype
		int a= 123;
		char[] ch = {'a','m','a','n'};
		long l=123456;
		System.out.println(String.valueOf(a)+" "+String.valueOf(ch)+" "+String.valueOf(l));
		
		
		//check data type
		System.out.println(str.getClass().getSimpleName());
		
	}
}
