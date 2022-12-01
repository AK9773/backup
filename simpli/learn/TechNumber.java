package simpli.learn;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = s.nextInt();
		int temp = number;
		s.close();
		int digit = 0;
		int sum=0;
		while (temp > 0) {
			digit++;
			temp = temp / 10;
		}
		if (digit % 2 != 0) {
			System.out.println("Not a Tech Number..");
		}else {
			int firstHalf= (int) (number/Math.pow(10, digit/2));
			int secondHalf= (int) (number%Math.pow(10, digit/2));
			sum= (int) Math.pow((firstHalf+secondHalf), 2);
			
			if(sum==number) {
				System.out.println("Tech Number..");
			}else {
				System.out.println("Not a Tech Number..");
			}
		}
		

	}

}
