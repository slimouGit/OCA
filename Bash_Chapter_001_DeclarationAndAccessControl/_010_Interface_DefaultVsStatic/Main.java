public class Main{
	public static void main(String[] args){
		
		Number number = new Number();
		System.out.println("Instance of Number and run default method: " + number.giveMeTheNumber());
		
		//illegal to run default method in static context
		//System.out.println("Instance of Number and run default method: " + Omniscient.giveMeTheNumber());
		

		System.out.println("Static call to run static method: " + Omniscient.omniscientNumber());

		//illegal to run call static method as an instance
		//System.out.println("Static call to run static method: " + number.omniscientNumber());

		
	}

}