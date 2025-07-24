package ConditionalStatements;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		
	System.out.print("Enter a number : ");
	Scanner obj = new Scanner(System.in);
	int num = obj.nextInt();
	
	if (num >= 0) {
		if (num == 0) {
			System.out.println("Given number is " + num +" Please enter number greater than 0");
		}
		
		else if (num %2 == 0) {
			System.out.println("Given number " + num +" is even number");
		}
		else {
			System.out.println(" Given number " + num +" is odd number");
		}
	}
	else {
		System.out.println("Please enter number which is  greater than 0");
	}
	obj.close();
	}

}
