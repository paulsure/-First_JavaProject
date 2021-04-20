package fusion;

public class Num {

		public static void main(String[] args) {
		// I am trying to validate the weight of two numbers
		
		int	PaulAge = 100;
		int	TopAge = 90;
		
		if (PaulAge > TopAge) {
			System.out.println( "Paul is older than Top");
		}
		else {
			System.out.println("Top is younger than Paul");
		}
		
		System.out.println("*******************NEXT PAGE*********************");
		
		double sScore = 41.3;
		
		if (sScore >= 90){
			System.out.println("Grade A");
		} else if (sScore >= 75) {
			System.out.println("Grade B");
		} else if (sScore >= 60) {
			System.out.println("Grade C");
		} else if (sScore >= 40) {
			System.out.println("Grade D. You have done your best but you need to work harder");
		} else {
			System.out.println("Where have you been? It is obvious you no dey come class");
		}
		
		System.out.println("*******************NEXT PAGE*********************");
		
		//This code is to find which of the number is greater among these three. 
		int num4 = -700;
		int num5 = -900;
		int num6 = -800;
		if (num4 > num5 && num4 > num6) {
			System.out.println(num4 + " is the greatest number");
		} else if (num5 > num4 && num5 > num6) {
			System.out.println(num5 + " is the greatest number");
		} else if(num6 > num4 && num6 > num4) {
			System.out.println(num6 + " is the greatest number");
		} //else if(num4 == num5 && num5 ==num6) {
			//System.out.println("There is no greatest number. Enter different numbers for each number field");
		//} 
		else {
			System.out.println("I will think more about it");
		}
		
		System.out.println("*******************NEXT PAGE*********************");
		//This is more numbers. Chai!!
		
		int num01 = 600;
		int num06=  1000;
		int num7 = 800;
		int num8 = 900;
		int num9 = 700;
		int num10 = 1000;
		
		if (num01 > num06 && num01 > num7 && num01 > num8 & num01 > num9 && num01 > num10){
			System.out.println(num01 + " is the greatest number");
		} else if (num06 > num01 && num06 > num7 && num06 > num8 & num06 > num9 && num06 > num10) {
			System.out.println(num06 + " is the greatest number");
		} else if(num7 > num06 && num7 > num01 && num7 > num8 & num7 > num9 && num7 > num10) {
			System.out.println(num7 + " is the greatest number");
		} else if(num8 > num01 && num8 > num06 && num8 > num7 & num8 > num9 && num8 > num10) {
			System.out.println(num8 + " is the greatest number");
		} else if(num9 > num06 && num9 > num01 && num9 > num8 & num9 > num7 && num9 > num10) {
			System.out.println(num9 + " is the greatest number");
		} else if(num10 > num06 && num10 > num01 && num10 > num8 & num10 > num9 && num10 > num7) {
			System.out.println(num10 + " is the greatest number");
		} else {
			System.out.println("There is no greatest number. Enter different numbers for each number field");
		} 
		
		System.out.println("*******************NEXT PAGE*********************");
		//I am trying to learn the FOR LOOP*********************
		for (int i = 2; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("*******************NEXT PAGE*********************");
		//This one is the Decremental version
		for (int i = 20; i >=10; i--) {
			System.out.println(i);
		}
		
		System.out.println("*******************NEXT PAGE*********************");
		//I am trying to learn the FOR LOOP*********************
		for (int i = 0; i <= 40; i+=4) {
			System.out.println(i);
		
	}
}
}