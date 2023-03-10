package Encaptulation;

public class RegisterPage {
	
	//setter-> helping assign the value and update value.
	//getter-> helping get the value
	//all private data members should be encapsualted by public getter and setter 
	//we can use business logic in getter and setter.but majorly used for assigning and getting value
	//if private vars private methods and main method in same class, we don't need getter and setter.
	//if main methods in different class we use getter and setter for private vars and methods.
	//for public vars we dont need getter and setter.
	
	
	//private vars encapsulated by public constructor
	private String name;
	private int age;
	private String adderess;
	private String dob;
	
//	private static void t1() {  //hiding information in method t1()
//		
//	}
//    public static void t2() {
//		t1();
//	}
	
	
	public RegisterPage(String name, int age, String adderess, String dob) {
		this.name = name;
		this.age = age;
		this.adderess = adderess;
		this.dob = dob;
	}

	public RegisterPage(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public RegisterPage(String name) {
		this.name = name;
		
	}
	



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdderess() {
		return adderess;
	}

	public void setAdderess(String adderess) {
		this.adderess = adderess;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	
	
	
	
	
	

}
