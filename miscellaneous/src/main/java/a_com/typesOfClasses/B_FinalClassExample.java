package a_com.typesOfClasses;

public class B_FinalClassExample {
	public static void main(String[] arg) {
		//B obj = new B();
		//obj.printmsg();
	}
}

final class A {
	void printmsg() {
		System.out.print("Base class method is executed.");
	}
}

//derived class  
//extending a final class which is not possible   
//it shows the error cannot inherit final class at compile time   
//class B extends A {
//	void printmsg() {
//		System.out.print("Derived class method is executed.");
//	}
//}