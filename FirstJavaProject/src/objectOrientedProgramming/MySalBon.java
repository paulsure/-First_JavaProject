package objectOrientedProgramming;

public class MySalBon {

	public static void main(String[] args) {
		
		Employee Ankoh = new Employee();
		Employee Gwen = new Employee();
		Employee Paul = new Employee();
		
		Ankoh.empName = "Ankoh ID";
		Ankoh.empID = 005;
		Ankoh.empSALARY = 500000;
		
		
		Gwen.empName = "Gwen Doline";
		Gwen.empID = 006;
		Gwen.empSALARY = 600000;
				
		Paul.empName = "Paul SURE";
		Paul.empID = 007;
		Paul.empSALARY = 550000;
		//Paul.empBONUS;
		
		Ankoh.EmployeeTakeHome();
		Gwen.EmployeeTakeHome();
		Paul.EmployeeTakeHome();
		
		Ankoh.ThankYouMess();
	}

}
