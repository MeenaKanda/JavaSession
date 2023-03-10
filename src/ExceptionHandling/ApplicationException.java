package ExceptionHandling;

//ApplicationException -> is custom Exception class 
// RuntimeException -> parent class constructor

public class ApplicationException extends RuntimeException {

	//// when we pass mesg , this message will given to RuntimeException(parent).RuntimeException also have one constructor which is calling Exception calling constructor

	
	public ApplicationException(String mesg) {  // when we pass mesg , this message will given to RuntimeException(parent). Then RuntimeException will take care of it
		super(mesg);  //super keyword used to calling the parent class constructor from child class const..
	}
	
	
}
