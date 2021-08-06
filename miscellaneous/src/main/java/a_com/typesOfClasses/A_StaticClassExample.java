package a_com.typesOfClasses;

public class A_StaticClassExample {

	private static final String str = "Learning about how to access Static Inner class";

	// nested class which is a Static class
	public static class StaticDemo {
		// non-static method of Static class
		private static final String str2 = "I am inner static class";
		public void show() {
			System.out.println(str);
		}
	}

	public static void main(String args[]) {
		A_StaticClassExample.StaticDemo obj = new A_StaticClassExample.StaticDemo();
		obj.show();
		String str2 = A_StaticClassExample.StaticDemo.str2;
	}
}
