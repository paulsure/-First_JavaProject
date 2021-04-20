package Overloading;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee newEmp = new Employee();
		
		newEmp.setEmpBonus(20);
		newEmp.setEmpID(1000);
		newEmp.setEmpSalary(20000);
		newEmp.setEmpName("Paul Oluwagbemiga");
		
		System.out.println(newEmp.getEmpBonus());
		newEmp.EmployeeTakeHome();

	}

}
