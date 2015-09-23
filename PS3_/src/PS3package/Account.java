
package PS3package;

import java.util.Date;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1122, 20000, .045);
		account.withdraw(2500);
		account.deposit(3000);
		java.util.Date dateCreated = new java.util.Date();

		System.out.println("Account ID: " + account.ID);
		System.out.println("Balance: " + account.getBalance());
		System.out.println("Interest Rate: " + account.getAnnualInterestrate());
		System.out.println("Date Created: " + dateCreated);
		System.out.println("Balance after withdraw: " + account.balancew);
		System.out.println("Balance after deposit: " + account.balanced);
		System.out.println("Monthly Interest: " + account.getMonthlyInterestRate());
		System.out.println("Done");

	}

	private int ID;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private double balancew;
	private double balanced;

	Account() {
		ID = 0;
		balance = 0.0;
		annualInterestRate = 0.0;

	}

	Account(int newiD, double newBalance, double newAnnualInterestrate) {
		ID = newiD;
		balance = newBalance;
		annualInterestRate = newAnnualInterestrate;
	}

	public int getiD() {
		return ID;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestrate() {
		return annualInterestRate;
	}

	public void setID(int newiD) {
		ID = newiD;
	}

	public void setBalance(double newBalance) {
		balance = newBalance;
	}

	public void setAnnualInterestrate(double newAnnualInterestrate) {
		annualInterestRate = newAnnualInterestrate;

	}

	public void setDatecreated(Date newDatecreated) {
		dateCreated = newDatecreated;
	}

	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	double withdraw(double money){

		return balancew = balance - money;

	}

	double deposit(double money) {
		return balanced = balance + money;
	}

}
