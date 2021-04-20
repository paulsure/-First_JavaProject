package objectOrientedProgramming;

public class Method {

	public static void main(String[] args) {
		  //Method with arguemnt
		Employee newmethodwitharg = new Employee();
		//Employee witharguemnt(5, 8)
		Employee newmethodwitharg.witharguemnt(5, 8);

		//using a return type arguement
		Employee returnArgEmployee =  new Employee();
		String num3 = returnArgEmployee.returnTypeArg(6, " is a number");
		System.out.println(num3);

	}

}
