package objectOrientedProgramming;

public class Employee {
		String empName;
		int empID;
		double empSALARY;
		double empBONUS;
		
		public void EmployeeTakeHome() {
			System.out.println("My name is "+ empName + " with ID " +empID+ ". My salary is "+ empSALARY +" and the Salary Bonus is: "+ empBONUS +".");
		}
		
		public void ThankYouMess(){
			System.out.println("Thank you "+ empName + " for making me understand this concept");
		}
	}