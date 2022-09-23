/*
 * Eloi Nshuti
 * Exercise 11-3
 * 9/22/2022
 */
public class Exercise11_3 {
	public static void main(String[] args) {

		// Account test.
		Account account = new Account();
		account.setId(1122);
		account.setBalance(20000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.println(account.toString());
		System.out.println("Balance: $" + account.getBalance());
		System.out.println("Monthly interest: $" + account.getMonthlyInterest() + "\n");
		
		// Savings account test.
		SavingsAccount savings = new SavingsAccount();
		savings.setId(1123);
		savings.setBalance(20000);
		savings.setAnnualInterestRate(4.5);
		savings.withdraw(25000);
		savings.deposit(3000);
	
		System.out.println("Balance: $" + savings.getBalance());
		System.out.println("Monthly interest: $" + savings.getMonthlyInterest());
		System.out.println(savings.toString());
		// Checking account test.
		
		
		
		
		CheckingAccount checking = new CheckingAccount();
		checking.setId(1124);
		checking.setBalance(20000);
		checking.setAnnualInterestRate(4.5);
		checking.withdraw(25000);
		checking.deposit(3000);
		
		System.out.println("\nBalance: $" + checking.getBalance());
		System.out.println("Monthly interest: $" + checking.getMonthlyInterest());
		System.out.println(checking.toString());
	}
}

class Account {
	
	private int id = 0;
	private double balance = 0;
	double annualInterestRate = 0;
	 private java.util.Date dateCreated;
	
	Account(){
		dateCreated= new java.util.Date();
	}
	Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
	}
	
	public int getId(){
		return id;
	}
	public int setId(int newId){
		return id = newId;	
	}
	
	public double getBalance(){
		return balance;
	}
	public double setBalance(double newBalance){
		return balance = newBalance;	
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public double setAnnualInterestRate(double newAnnualInterestRate){
		return annualInterestRate = newAnnualInterestRate;	
	}
	
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		double monthlyInterestRate = getAnnualInterestRate()/(12*100);
		return monthlyInterestRate ;
		}
	public double getMonthlyInterest(){
		double monthlyInterest = getMonthlyInterestRate()*balance;
	    return monthlyInterest;
		}
	
	public void withdraw(double amount){
		balance = balance - amount;
	}
	public void deposit(double amount){
		balance = amount + balance;
	}
	public String toString() {
		return  "Date: " + dateCreated;
	}
}

class SavingsAccount extends Account{
	protected double overDraftLimit = -500;
	
	SavingsAccount(){
		getDateCreated();
	}
	SavingsAccount(int newId, double newBalance, double overDraftLimit ){
		setId(newId);
		setBalance(newBalance);
		this.overDraftLimit = overDraftLimit;
	}
	
	@Override
	public void withdraw(double amount){
		;
		if ((getBalance() - amount) < overDraftLimit) {
			System.out.println("\nError: Withdraw amount exceeds overdraft limit.");
		}
		else
			setBalance(getBalance() - amount);
	}

	@Override
	public String toString() {
		
		return  "Savings account overdraft limit $500.";
	}
}


class CheckingAccount extends Account{
	
	CheckingAccount(){
		getDateCreated();
	}
	
	CheckingAccount(int newId, double newBalance){
		setId(newId);
		setBalance(newBalance);
	}
	
	@Override
	public String toString() {
		
		return  "Checking account no overdraft limit.";
	}
}
