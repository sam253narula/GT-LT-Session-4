package a_com.typesOfClasses;

public class D_ConcreteClassExample {
	// method of the concreted class
//	static int product(int a, int b) {
//		return a * b;
//	}
	
	public int product(int a, int b) {
		return a * b;
	}

	public static void main(String args[]) {
		// method calling
		D_ConcreteClassExample classExample = new D_ConcreteClassExample();
		int p = classExample.product(5, 4);
	//	int p = product(6, 8);
		System.out.println("Product of a and b is: " + p);
	}
}
