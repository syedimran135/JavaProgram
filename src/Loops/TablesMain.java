package Loops;

import java.util.Scanner;

public class TablesMain {
	
	public static void main(String[] args) {
		while(true) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter table number \n Please enter 0 for exit ");
		int num  = obj.nextInt();
		if (num == 0) { 
			System.out.println("Thank you");
			break;
		}
		Tables table = new Tables();
		table.table(num);
	}
	}

}
