package simpli.learn;

import java.util.Scanner;

public class ATMProgram {
	Account a = new Account();

	public void checkBalance() {

		System.out.println("Available Balance: " + a.getBalance());
	}
	public void deposite(int depositedAmount) {
		a.setBalance(a.getBalance() + depositedAmount);
		System.out.println("Amount Deposited Successfully");

	}

	public void withdraw(int withdrawAmount) {

		a.setBalance(a.getBalance() - withdrawAmount);
		System.out.println("Amount Withdrawn Successfully");

	}

	public static void main(String[] args) {
		Banking b = new Banking();
		Account a = new Account();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Password..");
		int enteredPassword = s.nextInt();
		s.close();

		if (enteredPassword == a.getPassword()) {
			b.banking();
		} else {
			System.out.println("Wrong Password...");
		}

	}

}
