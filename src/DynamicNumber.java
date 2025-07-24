import java.util.Scanner;

public class DynamicNumber {
	
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = obj.nextInt();
		obj.nextLine();
		//String result = num>0 ? "Positive" : num == 0 ? "Zero": "Negative";
		//System.out.println(num);
		
		System.out.println("Enter any Str1");
		String str1 = obj.nextLine();
		System.out.println(str1);
		
		System.out.println("Enter any Str2");
		String str2 = obj.nextLine();
		System.out.println(str2);
		
	}
	

}
