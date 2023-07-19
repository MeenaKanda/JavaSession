package SeleniumSessions;

public class Application {

	static int i = 10;
	
	// Method Overloading:
	// within the same class: we have different methods:
	// 1. with the same name
	// 2. with different number of parameters with different type
	// 3. with different sequence of parameters
	// 4.return type doesn't matter

	// Poly(Many)+Morphism(Forms) --OOP --many form of methods
	// method overloading => compile time polymorphism(static polymorphism)
	// polymorphism means => method overloading and method overriding

	public void test() { // 0 params
		System.out.println("test - 0 param");
	}

	// public int test() { // 0 params //return type doesn't matter
	// return 100;
	// }

	public void test(int i) { // 0 params

	}

	public void test(String i) { // 0 params

	}

	public void test(int i, int j) { // 0 params

	}

	public void test(int i, String j) { // 0 params

	}

	public void test(String i, int j) { // 0 params

	}

	// example of method overloading:
	// login:
	public void login() {

	}

	public void login(String un, String pwd) {

	}

	public void login(String un, String pwd, String role) {

	}

	public void login(String un, String pwd, String role, int otp) {

	}

	// search in amazon
	public void search() {

	}

	public void search(String productName) {

	}

	public void search(String productName, int price) {

	}

	public void search(String productName, int price, String color) {

	}

	// payment:
	public void doPayment(String cc, String cvv) {

	}

	public void doPayment(String upi) {

	}

	public void doPayment(String un, String pwd, int otp) {

	}
	
	
	public void go(float f) {
		System.out.println("float value" + f);
	}
	public void go(double f) {
		System.out.println("double value" + f);
	}

	public static void main(String[] args) {

		Application obj = new Application();
		obj.test();
		obj.test(20); // compiler always aware of test method with int to be called
		obj.test("naveen");
		
		obj.go(12.33);  //double value //preference will go for double
		obj.go(12.55f); //float value12.55
	}

}
