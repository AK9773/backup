package simpli.learn;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number= s.nextInt();
		s.close();
//		double digit=0;
//		double sum=0;
//		int temp=number;
//		while(temp>0) {
//			digit++;
//			temp=temp/10;
//		}
//		temp=number;
//		while(temp>0) {
//			int last=temp%10;
//			sum=sum+last*Math.pow(10, (digit-1));
//			digit--;
//			temp=temp/10;
//		}
//		System.out.println(sum);
		
		int reverse=0;
		int remainder=0;
		while(number>0) {
			remainder=number%10;
			reverse= reverse*10+ remainder;
			number=number/10;
		}
		System.out.println(reverse);
	}

}
