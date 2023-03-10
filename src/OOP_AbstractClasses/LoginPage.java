package OOP_AbstractClasses;

public class LoginPage extends Page {

	public LoginPage () {
		System.out.println("LP -- const...");
	}
	
	public LoginPage (int i) {
		System.out.println("LP -- const..." + i);
	}
	
	@Override
	public void title() {
		System.out.println("LP - title");	
	}

	@Override
	public void url() {
		System.out.println("LP - url");	
	}
	
	public void reserPwd() {
		System.out.println("LP - reset PWD");
	}
	
	@Override
	public void pageLoadingTime() {
		System.out.println("Page loading time 5 secs");
	}
	
	//method hiding: it is not Object Oriented
	public static void pageCycle() {
		System.out.println("LoginPage Cycle");
	}

	//from grandparent  //it is mandatory to implement(override) abstract method from grandparent I child class(or it give error in child class)(which imp all methods).
	//not mandatory to implement(override) in parent abstract class.(which will not imp all methods).parent class don't get any error
	@Override
	public void privacyPolicy() {
		System.out.println("LP - Privacy Policy");
		
	}

}
