package BreakAndContinue;

public class Continue1 {
	public static void main(String[] args) {
		for (int i=1; i<=100; i++) {
			if (i % 8 == 0) {
				System.out.println(i);
				continue;
			}
			
		}
	}

}
