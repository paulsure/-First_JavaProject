package fusion;
import java.util.Scanner;  // Import the Scanner class

public class HallThings {
			
	public static void main(String[] args) {
				
				    Scanner mygrade = new Scanner(System.in); 
					System.out.println("Enter your Grade Level");
					byte gLevel = mygrade.nextByte(); // Read user input
					System.out.println("Grade Level is: Level " +gLevel);  // Output user input
					//mygrade.close();
					
					//gLevel = 17;
				    
				if (gLevel >= 16) {
				System.out.println("Hurry, Please go to the Black Table, you got a Blue Hat!");
				}
				else if (gLevel >= 11 && gLevel <=15) {
				System.out.println("Hurry, Please go to the Red Table, you got a Green Hat!");
				}
				else if (gLevel >= 5 && gLevel <= 10) {
				System.out.println("Hurry, Please go to the Grey Table, you got a Grey Hat!");
				}
				else if (gLevel >= 2 && gLevel <= 4) {
				System.out.println("Hurry, Please go to the Purple Table, you got a purple Hat!");
				}
				else {
				System.out.println("WHAT ARE YOU LOOKING FOR? You are not invited and dont ever come back again!");
				}
			
			
	
	}
}

