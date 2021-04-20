package Overloading;

public class BankAccount {
	
	//This are the variables I believe would work for my object
	String AccName;
	int AccNum;
	double AccBal;
	int dep;
	int wdraw;
	
	; //AmountWithdrawn
	
	//Now I am creating a constructor.
	public BankAccount(String Name, int Number) {
		this.AccName = Name;
		this.AccNum = Number;
		//this.AccBal = Balance;
		//this.dep = Deposit;
		//this.wdraw = Withdraw; 
	}
	
	public void Deposit(int dep){ //AmountDeposit)
		System.out.println("You have deposited: "+ dep);
	}
	
	public void Withdraw (int wdraw) {
		System.out.println("You withdrew: "+ wdraw);
	}
	
	public void PrintAccDetails() {
				//return (AccBal);
		AccBal = dep - wdraw;
		System.out.println("Hello "+ AccName+ ", with Account Number: "+ AccNum + "; and your ACCOUNT BALANCE is: "+AccBal+". Thank you for banking with us");
	}
	
	
	
	

}
