package BreakAndContinue;

public class BreakInNestedLoop {
	
	public static void main(String[] args) {
		//Labels
		outer:
		for (int i=1; i<=3; i++) {
			
			inner:
			for (int j =1; j<=3; j++) {
			if (j  == 2) {
				break outer;
			}
			
			System.out.println("i: "+i +", j: "+j);
			}
		}
	}

}
