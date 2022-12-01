package simpli.learn;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int number= s.nextInt();
		s.close();
		int square= number*number;
		int temp= number;
		int digit=0;
		while(temp>0) {
			digit++;
			temp=temp/10;
		}
		if(number==(square% Math.pow(10,digit))) {
			System.out.println("Automorphic Number");
		}
		else {
			System.out.println("Not a Automorphic Number");
		}

	}

}
