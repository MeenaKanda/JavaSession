package OOP_Interface;

public interface USMedical extends WHO, USHG{
	
	int min_fee = 10;
	//vars: always static and final by default.
	
	
	//c - c -> extends
    //c - I -> implements
	//I - I -> extends
	
	
	//In interface  method body is not allowed.
//	public void test() {
//		
//	}
	
	//In Interface:
	//can not have the method body. it is called Abstract method
	//only method declaration - no business logic
	//only method prototype
	
	//In Java we can not create the Object of Interface.
	//because there is no method body/business logic/declaration in method.(Abstract Method) 
	//can not have const.. of the interface(Obj can not be created by interface)
	
	//Abstract Methods:
	//final - NA -> final abstract method in interface cannot have method body.no use of final method.
	//static - NA ->static method cannot be overridden. so not allowed.Abstract method should be overridden in child class.
	//private - NA -> private method requires body. but abstract method have no body. not allowed
	
	
	
	//one child class(Fortis) can imp n no of interface(US,UK,Indian) and extend only one parent class(Hospital).
	//parent class(Hospital) can implement also have multiple interface(US,UK,Indian)
	//n no of interfaces(US,UK,Indian) can extends one Interface also(WHO)
	//but final implementation will always be done by class only.
	
	//multiple inheritance allowed interface to interface.one interface can have multiple parent interface by extends keyword
	
	//Interface can not have parent class. Interface can have multiple parent interface.
	//class can have 1 parent class and also can have multiple interfaces.
	//multiple inheritance allowed class to interface and interface to interface.
	
	
	//jdk 1.7 : 100% abstraction (only have abstract methods)
	//jdk 1.8 : default non static methods: ~100%
	//if I have no abstract method - 0% abstraction
	
	//Abstract method can have return type and can have parameters.  eg: public String getTitle();  // public void get(String url)
	public void cardioServices();
	
	public void neuroServices();
	
	public void physioServices();
	
	public void emergencyServices();
	
	@Override
	public void covidVaccination();
	//fortis can override the WHO method.but no use of override in USMedical. finally class only going to implement the method. not interface(US)
	
   
	
	//After JDK 1.8:
	  //1. static method with method body allowed.
	public static void taxCalculation() {  //static method can not be overridden. but can method hiding
    	System.out.println("US- taxCalculation");
    }
	
	// In interface we can not have final method.
	//in interface we can not have private method
//	public final static void taxCalculation() {  //static method with final not allowed.
//    	System.out.println("US- taxCalculation");
//    }

     // 2. default methods allowed: not static:
	 default void getMedicalServices() {  //without defalut it won't work. //interface can take decision with default method.
		 System.out.println("US - getMedicalServices");
	 }
	
	 //before JDK 1.8 I cannot take any decision. now it can decision with the help of default method
    //eg:medical management system , ecommerce , if you have amazon/ecomerce as an interface , they really want to decide some functionality
    //of ecommerce application. it is not only the class responsibility sometimes I also take want to take a decision here /want to implement business logic here.
	//but no compulsion here.

}



 


//1.can we have main() method in Interface or not?

  //2. can we have parent class of Interface?
   //No it is not possible in Java.Interface can not have parent as a class.
   // Interface can have parent as an Interface.
   //class can have one parent class also and multiple Interface also.


  //3. can we have constructor inside the interface?
  //No. we cannot create object of interface. but whenever we create an object the const will be called. obj can not be created by interface.

  //4. which will participate in OOP? static or non static?
  //in OOP always not static method will participate. inside memory the photo copy of non static method will be given.
 // static method will be given to cma.

    //5.encapsulation is applicable in interface?
    //NO, because private methods not allowed here. so encapsulation not possible.
	

//6.Abstraction and encapsulation in Java?
//Abstraction -> is an another OO . we are hiding the method implementation and it implemented in child class.
//encapsulation-> hiding the private data members.









