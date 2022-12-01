package simpli.learn;

import java.util.Scanner;

public class PatternPrint {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = s.nextInt();
		s.close();
		for (int i = 0; i < number; i++) {
			for (int j = number; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
