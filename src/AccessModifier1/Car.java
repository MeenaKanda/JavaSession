package AccessModifier1;

//default keyword -> used in interface only
public class Car {

	public String name;
	private int price;
//	private static int price;   //allowed
	protected String color;
	String seller; // if not mention anything means-> defalut //should not write default

	public void publicMethod() {
		System.out.println("public Method");
	}

	protected void protectedMethod() {
		System.out.println("protected method");
	}

	void defaultMethod() {
		System.out.println("defaultMethod");
	}

	private void privateMethod() {
		System.out.println("private Method");
	}

	public static void main(String[] args) {
		
	//	public int i = 10;  //for loacal variable public private default not allowed
		final int i = 20;   //final allowed for local variable.

		Car c = new Car();
		c.price = 100;
        
	    c.publicMethod();
	    c.protectedMethod();
	    c.defaultMethod();
	    c.privateMethod();
	
	
	
	}

}

//why main method is always public?
// so main method can be accessed anywhere

// can we use public , private ,default for local variable? ans: no
//local variabale -> final access modifier only allowed for local variable(can be constant)
//local variable -> cannot be static

//global variable -> can be static
