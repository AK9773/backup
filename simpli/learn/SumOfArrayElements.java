package simpli.learn;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int n= s.nextInt();
		int numbers[]= new int[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=s.nextInt();
		}
		s.close();
		int sum=0;
		for (int i = 0; i < numbers.length; i++) {
			sum=sum+numbers[i];
		}
		System.out.println("Sum of Array Element: "+ sum);

	}

}
