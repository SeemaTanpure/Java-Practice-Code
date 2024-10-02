package Encapsulation;

public class TestBankAccount {

	public static void main(String[] args) {
		
		BankAccount bank=new BankAccount("232424",5000.0,"Seema Tanpure");
		bank.printStatement();
		bank.deposit(2000);
		bank.withdraw(1000);
		bank.setAccountNumber("2313211");
		bank.setOwner("Seema More");
		bank.printStatement();
		

	}

}
