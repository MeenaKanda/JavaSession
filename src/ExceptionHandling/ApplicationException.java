package ExceptionHandling;

public class ApplicationException extends RuntimeException {

	public ApplicationException(String mesg) { // when we pass mesg , this message will given to
												// RuntimeException(parent). Then RuntimeException will take care of it
		super(mesg); // super keyword used to calling the parent class constructor from child class
						// const..
	}

}
