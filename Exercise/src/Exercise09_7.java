/*
 * Eloi Nshuti
 * Exercise 9-7
 * 9/8/2022
 */
import java.util.Date;
public class Exercise09_7 {
	public static void main(String[] args) {
		 
		Account account = new Account();
		account.setId(1122);
		account.setBalance(20000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Balance: $" + account.getBalance());
		System.out.println("Monthly interest: $" + account.getMonthlyInterest());
		System.out.println("Date: " + account.getDateCreated());
	}
}

class Account{
	private int id = 0;
	private double balance = 0;
	double annualInterestRate = 0;
	private Date dateCreated;
	
	Account(){
		dateCreated = new Date();
	}
	Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
	}
	
	int getId(){
		return id;
	}
	int setId(int newId){
		return id = newId;	
	}
	
	double getBalance(){
		return balance;
	}
	double setBalance(double newBalance){
		return balance = newBalance;	
	}
	
	double getAnnualInterestRate(){
		return annualInterestRate;
	}
	double setAnnualInterestRate(double newAnnualInterestRate){
		return annualInterestRate = newAnnualInterestRate;	
	}
	
	String getDateCreated(){
		return dateCreated.toString();
	}
	
	double getMonthlyInterestRate(){
		double monthlyInterestRate = getAnnualInterestRate()/(12*100);
		return monthlyInterestRate ;
		}
	double getMonthlyInterest(){
		double monthlyInterest = getMonthlyInterestRate()*balance;
	    return monthlyInterest;
		}
	
	void withdraw(double amount){
		balance = balance - amount;
	}
	void deposit(double amount){
		balance = amount + balance;
	}
} 