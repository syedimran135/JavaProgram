package Loops;

import java.util.Scanner;

public class StringLoop {
	public static void main(String[] args) {
		
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter a string: ");
	String input = obj.nextLine();
	
	for (int i=0;i<input.length();i++) {
		System.out.println(input.charAt(i));
	}

}
}
