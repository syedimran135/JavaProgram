package Inheritance;
// Inheritance Concepts
public class Test {
	public static void main(String[] args) {
		
		
		
		//Single Inheritance
			Car obj = new Car();
			obj.car();
			obj.vehicle();
		
		//Multilevel Inheritance
			Fuel obj1 = new Fuel();
			obj1.vehicle();
			obj1.car();
			obj1.fuel();
		
		//Hierarcial Inheritance
			Hybrid obj2 = new Hybrid();
			obj2.hybrid();
			obj2.car();
		
			Ev obj3 = new Ev();
			obj3.ev();
			obj3.car();
	}
}
