package bankAccountApp;

import java.util.ArrayList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<Account>();
		
		// update path to be specific to your machine
		String file = "bin/NewBankAccounts.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		
		for(String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			
			if(accountType.equals("Savings")) 
			{
				accounts.add(new Savings(name, sSN, initDeposit));
			} 
			else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, sSN, initDeposit));
			} else {
				System.out.println("Error reading account type");
			}
		}
		
		for(Account acc : accounts) {
			acc.showInfo();
			System.out.println();
		}
		
		 Account testAcc = accounts.get(3);
		testAcc.deposit(5000);
		testAcc.withdraw(200);
		testAcc.transfer("Brokerage", 3000);
		testAcc.compound();

	}
}
