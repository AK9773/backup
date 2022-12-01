package simpli.learn;

import java.util.Scanner;

public class LeftRotateArrayElements {

	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6 };

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value of Elements to be rotated: ");
		int n = s.nextInt();
		s.close();
		
		int first[]= new int[n];
		for (int i = 0; i < first.length; i++) {
			first[i]=number[i];
		}

		for (int i = 0; i < number.length; i++) {
			if (i >= n) {
				number[i - n] = number[i];
			}

		}
		int count=n-1;
		for(int i=number.length-1; i>=(number.length-n);i--) {
			
			number[i]=first[count];
			count--;
		}
		
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + "  ");
		}

	}

}
