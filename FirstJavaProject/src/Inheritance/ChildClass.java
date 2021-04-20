package Inheritance;

public class ChildClass extends ObjOriented {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass ss = new ChildClass();
		//ObjOriented ss = new ObjOriented();
		ss.Num1 = 2;
		ss.Num2 = 5;
		
		ss.engine();
		ss.gear();
		ss.interior();
		ss.move();
	}
	public void move() {
		System.out.println("The Car is ready to move");
	}
	
	public void engine() {
		System.out.println("I am trying to create my engine Details");
	}
}
