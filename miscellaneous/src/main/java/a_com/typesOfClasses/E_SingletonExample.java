package a_com.typesOfClasses;

public class E_SingletonExample {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getObjectState());
		Singleton singleton2 =Singleton.getInstance();
	}
}

class Singleton {
	private String objectState;
	private static Singleton instance = null;

	private Singleton() throws Exception {
		this.objectState = "Lerning Singleton lazy fetch method";
	}

	public static Singleton getInstance() {
		if (instance == null) {
			try {
				instance = new Singleton();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return instance;
	}

	public String getObjectState() {
		return objectState;
	}

	public void setObjectState(String objectState) {
		this.objectState = objectState;
	}
}