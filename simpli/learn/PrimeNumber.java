package simpli.learn;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		double number = s.nextDouble();
		s.close();
		int count=0;
		double sqrt = Math.pow(number, 0.5);
		if (number == 0 || number == 1) {
			count=1;
		} else {
			for (int i = 2; i <= sqrt; i++) {
				if (number % i == 0) {
					count=2;
					break;
				}
			}
		}
		if(count==0) {
			System.out.println("Prime Number");
		}else if(count==1){
			System.out.println("Composite Number");
		}else {
			System.out.println("Not a Prime Number");
		}

	}

}
