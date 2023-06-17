package MethodsCallByValue;

public class Employee {
	//we can not call constructor in call by reference.only methods
	
	//call by value-> calling a method by passing a value is called call be value.
	//In c language we have call by reference in the form of pointers.but In java no concepts of pointers
	//call by reference -> in java we have Object and Object references
	//call by reference -> call a method by passing a class reference is called call by ref
	//in java one object can have 2 or more references
	//in call by ref we dont supply the value , we supply/passing the ref of the object.
	//call by reference ex in selenium : in page object module, page chaining module that is called zigzag pattern
	//In call by reference-> we can not call constructor by call by ref. constructor will be called when create the object.
	
	//adv of call by ref ->only one obj we created.if we have 10 methods we have to create 10 obj unnecessarily.
	//here with creating one obj we can have n no of ref .
	
	String name;
	int age;
	
	public int add(int a, int b) {
		System.out.println("sum of two numbers");
		int sum = a+ b;
		return sum;
	}
	
	//you can give emp ref only
	public void getInfo(Employee emp) {  //emp is just a reference  // type of emp is Employee type
		emp.name = "Amrita";             //emp and e1 both pointing to same object
		emp.age = 25;                    //with the help of emp assigning class variable 
	
		
		System.out.println(emp.name + "  " + emp.age);//Amrita 25
	}

	public static void main(String[] args) {
		//e1 always try to get updated value
		Employee e1 = new Employee();
		//e1.add(10, 20); //call by value 
		
		System.out.println(e1.name + "  " + e1.age); //null 0
		
		
		e1.name = "Gaurav";
		e1.age = 30;
		System.out.println(e1.name + "  " + e1.age);  //Gaurav 30
		e1.getInfo(e1); //call by reference  //e1=emp //e1 and emp pointing to same object now
		
		System.out.println(e1.name + "  " + e1.age); //Amrita 25 //e1 get the latest value
		

		
		
	}

}
