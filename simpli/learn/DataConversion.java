package simpli.learn;

public class DataConversion {
	public static void main(String[] args) {
		int a = 100;

		long b = a;

		float c = a;

		System.out.println("Long: " + b + " Float: " + c);

		double num = 50.75;
		float f = (float) num;
		long l = (long) num;
		int i = (int) num;

		System.out.println("Long: " + l + " Float: " + f + " int: " + i);

	}

}
