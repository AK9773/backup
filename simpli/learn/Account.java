package simpli.learn;

public class Account {
	private int balance;
	private String accountHolderName;
	private int password=1234;
	
	
	public Account() {
		super();
	}
	
	
	public Account(int balance, String accountHolderName, int password) {
		super();
		this.balance = balance;
		this.accountHolderName = accountHolderName;
		this.password = password;
	}


	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accountHolderName=" + accountHolderName + ", password=" + password
				+ "]";
	}
	
	
	
	
}
