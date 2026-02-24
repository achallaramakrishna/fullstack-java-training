package firstproj;

public class BankAccount {
	
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public BankAccount() {
		this.accountNumber = "";
		this.accountHolderName = "";
		this.balance = 0.00;
	}
	public BankAccount(String accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + "]";
	}
	
	// copy constructor
	public BankAccount(BankAccount ba) {
		this.accountNumber = ba.accountNumber;
		this.accountHolderName = ba.accountHolderName;
		this.balance = ba.balance;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	

}
