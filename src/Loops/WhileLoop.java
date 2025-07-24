package Loops;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		
		while(num != 0) {
			System.out.println(num + " times ");
			num = obj.nextInt();
		}
	}

}
