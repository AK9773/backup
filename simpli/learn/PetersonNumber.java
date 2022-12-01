package simpli.learn;

import java.util.Scanner;

public class PetersonNumber {
	
	public int factorial (int n) {
		int f=1;
		for (int i = 1; i <=n; i++) {
			f=f*i;
		}
		return f;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number = s.nextInt();
		int temp=number;
		s.close();
		int sum=0;
		PetersonNumber p= new PetersonNumber();
		
		while(temp>0) {
			int last= temp%10;
			sum=sum+ p.factorial(last);
			temp=temp/10;
		}
		if(number== sum) {
			System.out.println("Peterson Number...");
		}
		else {
			System.out.println("Not a Peterson Number...");
		}
	}

}
