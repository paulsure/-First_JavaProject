package Overloading;

public class Employee {
	
	private int empID;
	private int empS01;
	private int empBonus;
	private String empName;
	
	public String getEmpName() {
		return empName;
	}
	public int getEmpID() {
		return empID;
	}
	public int getEmpS01() {
		return empS01;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	public void setEmpSalary(int empSalary01) {
		this.empS01 = empSalary01;
	}
	public int getEmpBonus() {
		return empBonus;
	}
	public void setEmpBonus(int empBonus) {
		this.empBonus = empBonus;
	}
	
	void EmployeeTakeHome() {
		System.out.println("Hello "+ empName + ", with ID: " +empID+ ". I am pleased to inform you that your "
				+ "salary is "+ empS01 +". You are also entitled to a Salary Bonus of: "+ empS01 * empBonus /100  +".");
	}
}
