package string;

public class StringDemo {

	public static void main(String[] args) {

		String str1 = "welcome to java";
		String str3 = str1;
		String str2 = new String("welcome to java");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);

		System.out.println(str1.hashCode());
		System.out.println(str3.hashCode());

		str1 = "Welcome";
		System.out.println(str1.hashCode());
		System.out.println(str3.hashCode());
	}

}
