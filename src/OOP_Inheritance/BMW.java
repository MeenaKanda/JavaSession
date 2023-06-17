package OOP_Inheritance;

public class BMW extends Car {
	//every BMW is a Car
	//every car is not BME
	//method overriding always happen b/w parents and child
	
	//method Overriding: polymorphism - runtime/dynamic polymorphism
	//when we have a method in parent class and the same method in child class
	//with the same method name
	//with the same number of parameters
	//with the same seq of parameters
	//with the same return type
	
	//advantage -> reusability of methods.so BMW can only focus on start and autoparking methods
	
	
	
	@Override
	public void start() {  //override start method from par class
		System.out.println("BMW---start");  //method body can be anything. parent and child can have different method body in overridding.
	}
	
	public void autoParking() {  //individual method
		System.out.println("BMW---auto parking");
	}
	
 /*   @override
	public static void billing() {   // it gives error if it is override means
		System.out.println("Car---billing");
	}*/
	
	
	//Method Hiding
	public static void billing() {
		System.out.println("BMW---billing");
	}
	
	
	//final method can not be overridden in child class. because of final
/*	public static final void display() { // it give error
		System.out.println("BMW--display");
	}*/
	
	 
/*	public final void running() {  //error
		System.out.println("BMW--running");
	}*/
	
	@Override
	public void payment(String  cc, int cvv) {  //method overloaded and override achieve together
		System.out.println("BMW payment using : " + cc + " ; " + cvv);
	}
	
	@Override
	public void payment(String upi) {   //overloaded
		System.out.println("BMW payment using : " + upi);
	}
	
	@Override    //from grandparent
	public void engine() {
		System.out.println("BMW---engine");
	}
	
}
