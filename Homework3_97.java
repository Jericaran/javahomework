package Homework;

import java.util.Date;

public class Homework3_97 {

	public static void main(String[] args) {
		
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		account.withDraw(2500);
		account.deposit(3000);
		System.out.println("Balance: " + account.getBalance() + "\n"+ "Monthly Interest Rate: " + account.getMonthlyInterestRate() + "\n"+ "Date Created: " + account.getDateCreated());

	}

}

class Account {
	
	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account() {
		dateCreated = new Date();
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		double monthlyInterestRate = annualInterestRate / 12;
		return balance * monthlyInterestRate / 100;
	}
	
	public void withDraw(double money) {
		balance -= money;
	}
	
	public void deposit(double money) {
		balance += money;
	}
	
}

