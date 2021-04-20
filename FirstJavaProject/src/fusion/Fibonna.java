package fusion;

public class Fibonna {

	public static void main(String[] args) {
		int fNum1 = 0;
		int fNum2 = 1; 
		
		System.out.println(fNum1);
		System.out.println(fNum2);
		
		for ( int i = 1; i <= 28; i++) {
			
			int fNum3 = fNum1 + fNum2;
			System.out.println(fNum3);
			fNum1 = fNum2;
			fNum2 = fNum3;
		}
		

	}

}
