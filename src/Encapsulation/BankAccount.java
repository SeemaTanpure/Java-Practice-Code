package Encapsulation;

public class BankAccount {
	private String accountNumber;
	private double balance=5000;
	private String owner;
	
	
	public BankAccount() {
		System.out.println("Default constr...");
	}
	
	public BankAccount(String accountNumber, double balance, String owner) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.owner = owner;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Deposit added: "+amount);
		System.out.println("Balance after adding deposit: "+balance);
		
	}
	public void withdraw(double amount) {
		balance=balance-amount;
		System.out.println("Withdraw amount: "+amount);
		System.out.println("Balance after withdrawal: "+balance);
	}
	
	public void printStatement() {
		System.out.println("Print Statement of Account Number: " +accountNumber);
		System.out.println("A/c Owner:"+owner);
		System.out.println("A/c balance: "+balance);
	}

}
