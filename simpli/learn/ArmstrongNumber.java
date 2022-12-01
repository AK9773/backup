package simpli.learn;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = s.nextInt();
		int temp = number;
		s.close();
		double n = 0;
		double sum = 0;
		int last = 0;
		while (temp > 0) {
			n++;
			temp = temp / 10;
		}
		temp = number;
		while (temp > 0) {
			last = temp % 10;
			sum = sum + Math.pow(last, n);
			temp = temp / 10;
		}
		if (sum == number) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not a Armstrong Number");
		}
		

	}

}
