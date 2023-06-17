package Encaptulation;

// if all the methods are public. user can see everything which is not necessary for user.
//so make the public method to private.
//all private method called by public method.that is also encapsuation
//static method->methods are common for all the user, that method make it static
//user dont have access to private member directly.they access private data member through public member
//we wrap all private data member to public layer. giving the public layer to user
//we can achieve encapsulation using constructor.and assigning value to private member using constructor
//method to method encapsulation also possible. encapsulate all private methods to public method.

//we are able to create a getter and setter for public and static variables also. but not recommended.

public class Browser {

	public void launchBrowser() { //encapsuation method to method //private methods are encapsulated in public method
		 checkRAM();
		 checkVersion();
		 checkOS();
		 checkBrowserServices();
	}

	private void checkRAM() {
         System.out.println("checkRAM");
	}

	private void checkVersion() {
		System.out.println("checkVersion");
	}

	private void checkOS() {
		System.out.println("checkOS");
	}

	private void checkBrowserServices() {
		System.out.println("checkBrowserServices");
	}

}
