package bankAccountApp;

public abstract class Account implements IBaseRate {
	// List common properties for savings and checking accounts
	private String name;
	private String sSN;
	private double balance;

	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	// set base properties initialize account
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		
		// Set account number
		index++;
		this.accountNumber = setAccountNumber();
		setRate();
			
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOFSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random()  * Math.pow(10, 3));
		return lastTwoOFSSN + uniqueID + randomNumber;
	}
	
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance += accruedInterest;
		System.out.println("Accrued Interest: $" + accruedInterest);
		printBalance();
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("depositing $ " + amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transferring $" + amount + " to " + toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);
	}
	
	public void showInfo() {
		System.out.println(
			"Name: " + name + 
			"\nAccountNumber: " + accountNumber + 
			"\nBalance: " + balance +
			"\nRate: " + rate + "%" 
		);
		//System.out.println("Account Type: " + this.getClass().getSimpleName());
	}
	
	// list of common methods
	
}
