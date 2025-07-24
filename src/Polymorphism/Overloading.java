package Polymorphism;
//Test for overloading
public class Overloading {
	
	public void add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Additin of 2 Numbers = "+c);
	}
	
	public void add(int a) {
		
		System.out.println("Just int = "+a);
		
	}
	
	public void add(int a, int b, int c) {
		int d = a+b+c;
		System.out.println("Additin of 3 Numbers = "+d);
	}
	
	public void add(String name,int c) {
		System.out.println("FirstName: "+name);
		System.out.println(c);
		
	}
	
	public void add(int c,String name) {
		System.out.println(c);
		System.out.println("LastName: "+name);
	}
}
