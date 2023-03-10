package OOP_Constructor;

public class User {

	// class vari..
	String name;
	int age;
	String email;
	String password;
	String phone;
	
	static String price;

	// if you don't create any constructor of the class,the moment we create the->
	// object the defalut const.. will be called
	// hidden const..---- defalut const.. will be added by JVM
	// the moment we add parameterized const.. Java will not call default/hidden
	// const..
    //using this keyword we can access only class variables
	//const.. used to restricting the unnecessary Object
	//const.. don't have business logic
	
	public boolean forgotPwd() {
		//business logic
		return true;
	}
	
	public User(String name, int age) { // local variable

	//	name = name1;
	//	age = age1;
		
		this.name = name; //
		this.age = age;

	}
	

	public User(String name, int age, String email) { // local variable

		this.name = name;
		this.age = age;
        this.email = email;
	}
	
	public User(String name, int age, String email, String password) {
		
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
	}
	

	public User(String name, int age, String email, String password, String phone) {
		
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}


	public static void main(String[] args) {

		// User u1 = new User(); //hidden const..

		User u1 = new User("Tom", 25);

		// before add this keyword in const..
		// System.out.println(u1.name); //null //object hold class vari..
		// System.out.println(u1.age); //0 //getting default value of class vari

		// after add this keyword to initialize the class vari

		System.out.println(u1.name); // tom
		System.out.println(u1.age); // 25
		System.out.println(u1.email);  //null

		User u2 = new User("Lisa", 30, "lisa@gmail.com");
        System.out.println(u2.name); //lisa
        System.out.println(u2.email); //lisa@gmail.com
        System.out.println(u2.password); //null
        
   //     User u3 = new User();  //can't create this Object
	
     User u3 = new User("Nosha",25, "nisha@gmail.com", "987655444");   
        System.out.println(u3.name+ " " +u3.phone);
     
	}

}
