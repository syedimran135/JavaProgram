package BreakAndContinue;

public class Break1 {
	
	public static void main(String[] args) {
		for (int i=1; i<=100; i++) {
			if (i % 9 == 0) {
				System.out.println(i);
				break;
			}
			System.out.println(i);
		}
	}
}
