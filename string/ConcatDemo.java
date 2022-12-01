package string;

public class ConcatDemo {

	public static void main(String[] args) {
		String str = "Welcome to Java ";
		
		System.out.println(str.length());
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		String newString = str.concat("programming language");
		System.out.println(newString);
		
		String str2 = "programming language";
		String newString2 = str.concat(str2);
		System.out.println(newString2);
		
		System.out.println(newString.hashCode());
		System.out.println(newString2.hashCode());
		
		System.out.println(newString==newString2);
		System.out.println(newString.equals(newString2));
		
	}
}
