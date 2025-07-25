package ImportantPrograms;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
			int count = 0;
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter tyhe number to verify prime number");
			int num = obj.nextInt();
			for (int i =1; i <=num; i++ ) {
				if (num % i == 0){
						count++;
				}
			}
			System.out.println(count);
			if (count == 2) {
				System.out.println(num + " This is Prime Number");
			}else {
				System.out.println(num + " This is not Prime Number");
			
			
			
			}
	}

}
