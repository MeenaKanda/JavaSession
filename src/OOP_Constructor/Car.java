package OOP_Constructor;

public class Car {
	
	//constructor used to create data for my class variable for specific object
	//constructor should not hold business logic.
	//features of the car should be defined in the form of methods.
	//cont..is restricting the user to create the unnecessary obj of particular class.if user want to create obj, have to supply data.
	String name;
	String color;
	int price;
	boolean isAutomatic;
	
	public double getCarMilage() {
		double a = 12.33;
		double b = 23.44;
		double mg = a + b;
		return mg;
	}
	
	public Car(String name, String color) {
		this.name = name;
		this.color = color;
		
	//	int x = 10;  //applicable for this constructor only
	//	this.price = x;
	}

	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Car(String name, int price, boolean isAutomatic) {
		this.name = name;
		this.price = price;
		this.isAutomatic = isAutomatic;
	}

	public Car(String name, String color, int price, boolean isAutomatic) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.isAutomatic = isAutomatic;
	}
	
	

}
