package Encapsulation;

import AccessModifier.Student1;

public class Test extends Student1 {
	
	public static void main(String[] args) {
		
		//Public AccessModifier saying it can be accessed all over the project
		Student1 obj = new Student1();
		obj.student1();
		
		//Private Accessmodifier
		SetterAndGetter obj1 = new SetterAndGetter();
		obj1.setAge(28);
		System.out.println(obj1.getAge());
		obj1.setName("ImranSyed");
		System.out.println(obj1.getName());
		
		//Protected
		Test obj3 = new Test();
		System.out.println(obj3.a);
		
	}

}
