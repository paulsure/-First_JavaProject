package ObjOrient;

	public class Human implements Behaviours {
		
		public void talk(){
		System.out.println("Talks Gently and clearly");
		}
		public void sleep() {
			System.out.println("Zzzzzzzzzzzz");
		}
		public void work() {
			System.out.println("Loves to work organized");
		}
		
		@Override
		public void walk() {
			System.out.println("Calm and Collected");
		}
}		
	
