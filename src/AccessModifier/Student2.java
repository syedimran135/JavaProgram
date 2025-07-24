package AccessModifier;

public class Student2 extends Student1 {

	int a = 20;
	String name1 = "Sai";
	
	public void student2() {
		System.out.println(name1);
		System.out.println(a);
	}
	
public static void main(String[] args) {
	
	Student2 std2 = new Student2();
	System.out.println(std2.name);
}
}
