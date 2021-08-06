package a_com.typesOfClasses;

public class C_AbstractClassExample extends MathematicalOperations {
	// definition of abstract method
	public void add() {
		System.out.println("Sum of a and b is: " + (a + b));
	}

	public static void main(String args[]) {
		MathematicalOperations obj = new C_AbstractClassExample();
		obj.add();
	}
}

abstract class MathematicalOperations {
	int a = 30;
	int b = 40;

//abstract method  
	public abstract void add();
//	protected int sub() {
//		return 1;
//	}
}