package simpli.learn;

import java.util.Scanner;

public class Banking {
	ATMProgram atm = new ATMProgram();
	Scanner s = new Scanner(System.in);
	public void banking() {
		System.out.println("1: deposite, 2: withdraw, 3: check balance");
		System.out.println("Choose Operation: ");
		int choice = s.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter Amount to be deposited..");
			int depositedAmount = s.nextInt();
			atm.deposite(depositedAmount);
			break;
		case 2:
			System.out.println("Enter Amount to be withdrawn..");
			int withdrawAmount = s.nextInt();
			atm.withdraw(withdrawAmount);
			break;
		case 3:

			atm.checkBalance();
			break;

		default:
			System.out.println("Invalid Choice");
			break;
		}
	}
}
