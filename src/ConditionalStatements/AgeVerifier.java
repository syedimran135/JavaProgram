package ConditionalStatements;


public class AgeVerifier {
	
	public void maleAgeverifier(int num, int age) {
		if (num > 0 && num <=2) {
			if (num == 1) {
	
				
				if (age >=21) {
					System.out.println("Hurry congrats :) you're Eligible for Marriage");
					System.out.println(" ");
				}
				else {
					System.out.println("Sorry :( you're not  Eligible for Marriage \n As you're a male you should be atleast 21 for marriage");
					System.out.println(" ");
				}
				
			}else {
				if (age >=18) {
					System.out.println("Hurry congrats :) you're Eligible for Marriage");
					System.out.println(" ");
				}
				else {
					System.out.println("Sorry :( you're not  Eligible for Marriage \n As you're a Female you should be atleast 18 for marriage");
					System.out.println(" ");
				}
			}
			}else {
				System.out.println("Please select either 1 or 2");
			
	}

}
}
