package firstproj;

public class BankAccountProgram {

	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount();
		bankAccount.setAccountNumber("a001");
		bankAccount.setAccountHolderName("Rama Achalla");
		bankAccount.setBalance(0);
		System.out.println(bankAccount);

		bankAccount.deposit(2000);
		System.out.println(bankAccount);

		bankAccount.withdraw(500);

		System.out.println(bankAccount);
	}

}
