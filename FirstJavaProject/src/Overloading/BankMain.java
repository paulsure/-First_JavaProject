package Overloading;

public class BankMain {
	public static void main(String[] args) {
		BankAccount Paul = new BankAccount("Paul", 35965);
		Paul.Deposit(2000);
		Paul.Withdraw(200);
		Paul.PrintAccDetails();
		
	}

}