package Polymorphism;

public class Test {

		public static void main(String[] args ) {
			
			//OverLoading
			
			Overloading obj = new Overloading();
			obj.add();
			obj.add(20);
			obj.add(10,20,30);
			obj.add("Imran",28);
			obj.add(28,"Syed");
			
			//OverRiding
			
			Child obj1 = new Child();
			obj1.parent();
		}
		
		
		
}
