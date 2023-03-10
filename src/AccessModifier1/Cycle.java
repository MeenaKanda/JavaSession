package AccessModifier1;

public class Cycle {

	public static void main(String[] args) {
	//Cycle is not a child of Car. so we need to create obj of Car class to access Car class property	
		
		Car c = new Car();
		c.name = "Bicycle";
		c.color ="blue";
		c.seller = "Honda";
//		c.price            //private can not be accessed by another class in same package
		

		c.publicMethod();
		c.protectedMethod();
		c.defaultMethod();
//		c.privateMethod();   //can not access  
	}

}
