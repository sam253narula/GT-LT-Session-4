package a_com.typesOfClasses;
// Static member can access only other static members and Non-static members can access both(Other static and non-static)
// non-static is also called instance level members
public class G_InnerClassExample {

	private int privInt = 10;
	private static int b = 20;

	public void createInnerClass() {

		InnerClass inClass = new InnerClass();
		inClass.accessOuter();
	}

	class InnerClass {

		public void accessOuter() {
			System.out.println("The outer class's privInt is " + privInt);
		//	System.out.println(b);
		}

	}

	public static void main(String[] args) {
		// create instance of outer class first:
		G_InnerClassExample outClass = new G_InnerClassExample();
		 G_InnerClassExample.InnerClass inner = outClass.new InnerClass();
		inner.accessOuter();
		//outClass.createInnerClass();
		
	//	G_InnerClassExample.InnerClass inner2 =  new G_InnerClassExample().new InnerClass();
		
	}
}
