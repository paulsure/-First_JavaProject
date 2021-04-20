package Overloading;

public class Method_Overloading {
		// overloading is a process whereby one uses the same method name but in order to successfully do
		// this, one needs to use a differet variable type with the new method. e.g printThis, printThis(Sting name),
		// printThis(int myage)

		int myAge =  10;
		String myName = "Paul";
		String myJob = "Tester";
		int  myJobYears = 1;

		public void printFirstMethod() {
		System.out.println(myAge);
		}
		public void printFirstMethod(int age) {
		System.out.println(age);
		}
		public void printFirstMethod(String JobYears) {
		System.out.println("I have worked here for "+ JobYears+ " year(s)");
		}

		public static void main (String[] args) {
		Method_Overloading exampleMethod_Overloading = new Method_Overloading();
		exampleMethod_Overloading.printFirstMethod();
		exampleMethod_Overloading.printFirstMethod(2);
		exampleMethod_Overloading.printFirstMethod(1);


		}

	}
