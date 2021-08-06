package a_com.typesOfClasses;

public class F_PojoClassExample {

	public static void main(String args[]) {
		PojoDemo obj = new PojoDemo();
		System.out.println("The price of an article is " + obj.getPrice() + " Rs.");
	}
}

class PojoDemo {
//private variable      
	private double price = 99.34;

//getter method  
	public double getPrice() {
		return price;
	}

//setter method  
	public void setPrice(int price) {
		this.price = price;
	}
}