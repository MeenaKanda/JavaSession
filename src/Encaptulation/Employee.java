package Encaptulation;

public class Employee {
	//class varis / data members
	//user can access public property directly. not private property.
	//public property can internally calling/access all private property	
	//user cannot access private property directly
	//according to requirement decide which vars is private and public.
	//user can access the private property via public member/layer which can only access all the private property.
	
	public String name;
	public int age;
	private double salary;
	
	//public getter and setter method : always prefer for private members.not public
	
	public double getSalary() {  // this method to fetch the value assigned for salary
		return salary;
	}
	
	public void setSalary(double salary) {  // this one used assign the salary(which is private)
		this.salary = salary;
	}
	
	
	
/*	public static void main(String[] args) {
	Employee e1 = new Employee();
	e1.name = "Tom";  //public
	e1.age = 25;    //public
	e1.salary = 90;   //private property can accessed only from same class. not outside of class
	System.out.println(e1.name); //tom
	System.out.println(e1.getSalary());  //90
	}*/
}
