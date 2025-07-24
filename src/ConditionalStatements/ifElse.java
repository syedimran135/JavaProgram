package ConditionalStatements;

import java.util.Scanner;

public class ifElse {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = obj.nextInt();
		
		
		if (a>0) {
			System.out.println("This is positive");
		}
		else {
			System.out.println("This is negative");
		}
		obj.close();
	}

}
