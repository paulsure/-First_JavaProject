package fusion;

public class Strings {

	public static void main(String[] args) {
		String str1= "How are you?";
		String str2= "Fine";
		String str3 = str1 +" " + str2;
		System.out.println(str3);
		System.out.println(str2.length());
		String str4= "       Welcome to Emy's World     ";
		System.out.println(str4.trim());
		System.out.println(str4.length());
		String str5 = (str4.trim());
		System.out.println(str5.toUpperCase());
		
		String mystr = "ABCD";
		
		System.out.println(mystr.charAt(3));
		for (int i= 3; i >= 0; i--){
			System.out.print(mystr.charAt(i));
		}	
	
	}
	
   
	
	
}
