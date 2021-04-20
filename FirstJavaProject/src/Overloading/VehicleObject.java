package Overloading;

public class VehicleObject {

	public static void main(String[] args) {
		// I am creating new objects for vehicles
		Vehicle keke = new Vehicle (2, "Keke"); //Class newObject = new Vehicle (initialise the variable)
		keke.tollCharges(); //newObject.method
		Vehicle Sedan = new Vehicle (4, "Sedan");
		Sedan.tollCharges();
		Vehicle Truck = new Vehicle (12, "Truck");
		Truck.tollCharges();
		Vehicle Oversabi = new Vehicle (16, "Oversabi Vehicle");
		Oversabi.tollCharges();

	}

}
