package ConditionalStatements;

import java.util.Scanner;

public class Calculation {
	
	public static void main(String[] args) {
		while(true) {
		System.out.println("");	
		System.out.println("Please enter \n 1. Addition \n 2. Substraction \n 3.Multiplication \n 0.Exit ");
		System.out.println("");
		Scanner  obj = new Scanner(System.in);
		int num = obj.nextInt();
		if (num == 0) {
			System.out.println("Thank you");
			break;
		}
		
		switch (num) {
		
		case 1:
			Addition add = new Addition();
			System.out.println("Enter first number ");
			int num1 = obj.nextInt();
			System.out.println("Enter Second number ");
			int num2 = obj.nextInt();
			System.out.println("Enter Third number ");
			int num3 = obj.nextInt();
			System.out.println("Enter Fourth number ");
			int num4 = obj.nextInt();
			
			add.addition(num1,num2);
			add.addition(num1,num2,num3);
			add.addition(num1,num2,num3,num4);
			break;
			
		case 2:
			Substraction sub = new Substraction();
			System.out.println("Enter first number ");
			num1 = obj.nextInt();
			System.out.println("Enter Second number ");
			num2 = obj.nextInt();
			System.out.println("Enter Third number ");
			num3 = obj.nextInt();
			System.out.println("Enter Fourth number ");
			num4 = obj.nextInt();
			
			sub.substraction(num1,num2);
			sub.substraction(num1,num2,num3);
			sub.substraction(num1,num2,num3,num4);
			break;
			
		case 3:
			Multiplication mul = new Multiplication();
			System.out.println("Enter first number ");
			num1 = obj.nextInt();
			System.out.println("Enter Second number ");
			num2 = obj.nextInt();
			System.out.println("Enter Third number ");
			num3 = obj.nextInt();
			System.out.println("Enter Fourth number ");
			num4 = obj.nextInt();
			
			mul.multiply(num1,num2);
			mul.multiply(num1,num2,num3);
			mul.multiply(num1,num2,num3,num4);
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		
		}
	}

}
