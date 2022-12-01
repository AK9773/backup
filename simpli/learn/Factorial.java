package simpli.learn;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int number = s.nextInt();
		s.close();
		int factorial = 1;
		if (number == 0 || number == 1) {
			factorial=1;
		} else {
			for (int i = 1; i <= number; i++) {
				factorial= factorial*i;
			}
		}
		System.out.println("Factorial of Entered Number is : "+ factorial);
	}
}
