package f_com.rnd;

public class LetsSeeManyInnerClasses {
	//private int a = 9;
	public LetsSeeManyInnerClasses() {
		System.out.println("I am the outer class");
	}

	class A {
		public A() {
			System.out.println("1st inner class A");
		}

		class B {
			public B() {
				System.out.println("2nd inner class B");
			//	System.out.println("Can i access a "+ a);
			}

		}
	}
	
	public static void main(String[] args) {
		LetsSeeManyInnerClasses outerClass  = new LetsSeeManyInnerClasses();
		LetsSeeManyInnerClasses.A a = outerClass.new A();
		LetsSeeManyInnerClasses.A.B b = a.new B();
	}
}
