package Overloading;

public class Vehicle {
		int tyres;
		String vehicleType;
		
		//I am trying to have a constructor
		
		public Vehicle(int vTyres, String vType){
					this.tyres = vTyres;
					this.vehicleType = vType;
		}		
		
		public void tollCharges() {
			if (tyres == 2) {
				System.out.println("Your Vehicle type is " + vehicleType + " and has " + tyres + " tyres. Hence, your Pay is: " + (100 +(100 * 0.05)));
			}
			if (tyres == 3) {
				System.out.println("Your Vehicle type is " + vehicleType + " and has " + tyres + " tyres. Hence, your Pay is: " + (120 +(100 * 0.05)));
			}
			if (tyres == 4) {
				System.out.println("Your Vehicle type is " + vehicleType + " and has " + tyres + " tyres. Hence, your Pay is: " + (120 +(100 * 0.05)));
			}
			if (tyres == 12) {
				System.out.println("Your Vehicle type is " + vehicleType + " and has " + tyres + " tyres. Hence, your Pay is: " + (140 +(100 * 0.07)));
			}
			if (tyres > 12) {
				System.out.println("Your Vehicle type is " + vehicleType + " and has " + tyres + " tyres. Hence, your Pay is: " + (200 +(100 * 0.09)));
			}
		}
}


