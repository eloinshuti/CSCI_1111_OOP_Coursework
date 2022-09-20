/*
* Eloi Nshuti
* Exercise 9-7
* 9/20/2022
*/


import java.util.Date;
import java.util.Scanner;
public class Exercise10_7 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Account account = new Account();
		
		int[] id = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		double initialBalance = account.setBalance(100);
		
		System.out.print("Enter id: ");
		int setId = input.nextInt();
		
		int valid = 0;
	
		for(int i = 0; i < id.length; i++) {
			
			if(setId == id[i]) {
				account.setId(setId);
				valid = 1;
			}
			
			if(valid == 0 && (i == id.length -1)) {
			System.out.println("Invalid id \n");
			System.out.print("Enter id: ");
			setId = input.nextInt();
			i = 0;
			}
			
			if(valid == 1) {
				System.out.println("\nMain menu: ");
		        System.out.println("     1. View current balance");
		        System.out.println("     2. Withdraw money");
		        System.out.println("     3. Deposit Money");
		        System.out.println("     4. Exit Main menu");
		        System.out.print("Enter the number of the selected option: ");
		        int option = input.nextInt();
		
		        if(option == 1) {
		            System.out.println("Balance: $" + account.getBalance());
		        }
		    	else if (option == 2) {
		        	System.out.print("Enter withdrawal amount: ");
		        	double withdrawal = input.nextDouble();
		        	account.withdraw(withdrawal);
		        }
		   	 	else if (option == 3) {
		        	System.out.print("Enter deposit amount: ");
		        	double deposit = input.nextDouble();
		        	account.deposit(deposit);
		        }
		    	else if (option == 4) {
		    		valid = 0;
		        	System.out.print("\nEnter id: ");
		        	setId = input.nextInt();
		        	i = 0;
		        }
			i = 0;
			}
		}
	}
}

/*
 * Account Class 
 */
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