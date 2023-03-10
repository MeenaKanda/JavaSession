package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();   //BMW child  //overridden method //preference always given to overridden
		b.stop();    //Car par //inherited method
		b.refuel();  //Car par //inherited
		b.autoParking(); //BMW //individual method
		
		BMW.billing(); //BMW billing    //In method hiding
		Car.billing(); //Car billing
		
//		BMW.billing(); //Car billing //if BMW not overridden static method
		
		BMW.display(); //Car display //inherited method
		
		b.running();  //Car running //inherited method
		
		b.payment("meena@2767");  //BMW
		
		b.engine();  //BMW
		
		System.out.println("-------Audi---------");
		Audi au = new Audi();
		au.theftSafety();
		au.start();
		au.stop();
		
		System.out.println("----------------");
		
		Car c = new Car();  // able to access only parent class methods
		c.start();
		c.stop();
		c.refuel();
	  //	c.autoparking();  //parent class cannot access the BMW individual methods

		c.payment("meena@1777689");
		
		c.engine();  //Vehicle
		
		System.out.println("----------------");
		
		
		//child class object can be referred by parent class ref variable
		//Top/Up Casting
		Car c1 = new BMW();   //every BMW is a Car
		//object is BMW that is referred by Car class ref vars c1
		//type of c1 is Car                    
		
		c1.start();  //BMW //
		c1.stop();    //Car
		c1.refuel();  //Car
		c1.petrolEngine();
//		c1.autoParking();   //not allowed because autoparking is individual methods(nothing related to Car). so it cannot be accessed by Car class ref vars.
		 //star(overridden), stop and refuel(inherited) method are from parents class(related to car). so parent class ref able to access it.
	     
		//ref type check will be failed in individual method.
	    c1.engine();
	    c1.payment("meena1234");
	    c1.payment("kanda123", 120);
	    c1.running();
	 
	    //down casting:
		//parent class object can be referred by child class ref variable
	//	BMW b1 = new Car();   //every Car is a BMW? No
		
	//	BMW b1 =(BMW) new Car(); //ClassCastException at run time. not compile time error(fooling the compiler at compile time)
		//creating car Object and converting into a BMW Object  
	    //painting(decorate)Car like BME at compile time But while running it shows exception 
	
	
		System.out.println("----------------");
	
		//child class object can be referred by grand parent class ref variable
	    //v-> can access only overridden and methods available in grand parent class(Vehicle).can not access methods from parent class(Car)
		//Top/Up Casting
		Vehicle v = new BMW(); //every BME is a vehicle
		v.petrolEngine();  //Vehicle
		v.engine();    //BMW
		
		 
	
	    //down casting:
			//parent class object can be referred by child class ref variable
		//	BMW b2 = new Vehicle();   //every Car is a Vehicle? No
	
//	    BMW b2 =(BMW) new Vehicle();  //classCastException
		
	    
	}

}
