package Loops;

import java.util.Scanner;

public class ReverseNumbers {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter the number to reverse in count");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		for (int i = num; i>=1 ; i--) {
			System.out.println(i);
		}
	}

}
