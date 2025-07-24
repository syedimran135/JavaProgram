package ConditionalStatements;

import java.util.Scanner;

public class MarriageAgeVerifier {
	
	public static void main(String[] args) {
		while(true) {
		System.out.println("Please choose which gender you want to select" + " \n 1. Male \n 2. Female \n 0. Exit");
		Scanner  obj = new  Scanner(System.in);
		System.out.print("Please enter gender number : ");
		int num = obj.nextInt();
		if (num == 0) {
			System.out.println("Thank you");
			break;
		}
		if (num > 0 && num <=2) {
		System.out.print("Please enter age : ");
		int maleAge =  obj.nextInt();
		
		AgeVerifier obj1 = new AgeVerifier();
		obj1.maleAgeverifier(num,maleAge);
		
		}
		else {
			System.out.println("Invalid number");
		}
		
		
		
	}

}
}
