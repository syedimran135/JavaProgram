package AccessModifier;

public class Test {
	
	public static void main(String[] args) {
		
		//public AccessModifier
		Student2 obj = new Student2();
		obj.student1();
		
		//protected Accessmodifier
		obj.student1p();
		
		//Default Accessmodifier
		System.out.println(obj.name);
		
		
	}

}
