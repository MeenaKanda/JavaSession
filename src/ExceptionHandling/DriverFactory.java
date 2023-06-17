package ExceptionHandling;


public class DriverFactory {
	
	//throw -> using throw keyword we can throw our own custom exception(not build in exception)
    // throw keyword used to delebrately throw your own exception.
	public static void main(String[] args) {
		
		
	//	String browser = "chrome";
		String browser = null;
		
		if((browser == null)) {
			try {
			throw new Exception("browser not found");  //supply(own) message what kind of exception we are getting//it exception should be handled by try catch block
		//  throw new RuntimeException("browser not found");
		//	throw new NullPointerException("browser not found");
		//	throw new ArithmeticException("browser not found");   //we can throw any kind of exception(our choice)
			
			}
			catch(Exception e){   //RuntimeException e //Throwable e
				System.out.println("begin catch block");
				e.printStackTrace();
				System.out.println("end catch block");
			}
			}
		
		else {
			System.out.println("browser is launched");
		}

		System.out.println("bye");
	}

}
