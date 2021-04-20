package Inheritance;

import Inheritance.GlobaTraffic;
import Inheritance.FRSCRegulations;

public class InterfaceImplementation implements GlobaTraffic, FRSCRegulations{
	public static void main(String[] args) {
		GlobaTraffic objName = new InterfaceImplementation();
		objName.greenlight();
		objName.redlight();
		objName.yellowlight();
		
		InterfaceImplementation objName1 = new InterfaceImplementation();
		objName1.additionalMethod();
		
		FRSCRegulations objName2 = new InterfaceImplementation();
		objName2.dontDriveDrunk();
		objName2.driveWithValidLicense();
		objName2.wearSeatBelt();
		
 	}
	private void additionalMethod() {
		// TODO Auto-generated method stub
		
	}
	
	public void greenlight() {
		System.out.println("When you see Green light..... Start Moving");
	}
	
	public void redlight() {
		System.out.println("When you see the Red light.... Stop Moving");
	}
	
	public void yellowlight() {
		System.out.println("When you see the Yellow light..... Prepare to move");
	}
	
	@Override
	public void dontDriveDrunk() {
		// TODO Auto-generated method stub
		System.out.println("This is a punishable offence under the LAW");
	}
	
	@Override
	public void driveWithValidLicense() {
		// TODO Auto-generated method stub
		System.out.println("This is a Punishable offence. Please DONT TRY IT");
		
	}
	
	@Override
	public void wearSeatBelt() {
		// TODO Auto-generated method stub
		System.out.println("We encourage all drivers to Wear their Seat Belts while Driving");
	}

}
