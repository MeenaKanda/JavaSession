package ExceptionHandling;

public class Employee {
	     String name;
	
//       Exception-> unwanted line of code/lines of code which is giving you an exception and
	//because of that the program getting terminated.if you write 1000 lines of code after exception, it never be executed.
	//in order to execute remaining program we have to handle those exception which is called exception handling using try catch.
	
	//in try-> whatever statement write after exception in try block it never be executed.
	//catch block-> getting activated only when you get exception in try block.catch block never executed without exception in try.
	
	//try to write exact exception in catch block.
	//Exception -> because of problem from your code.exception more prone to come.
	//Error -> not because of your code.Stackoverflow is error because memory getting full and out of memory.hardware failure,memory leakage,because of infrastructure
	//error come rare.
	
	//Exception -> can handle only exception of any kind of exception.
	//Error -> can handle only Error
	//Throwable -> can handle exception and error.when try block have both error and exception we use Throwable in catch block to handle both.
	
	//Throwable -> Exception -> AE,NPE,SQLE,
	//Throwable -> Error ->StackOverflow
	
	//types of exception:
	     //1.unchecked exception: compiler can not identified during compilation time. identified during runtime only.all runtime exceptions are unchecked exception.
	    //EX:AE.NPE,IO:AIOB,SIOB
	     //2.checked exception: compiler can identify during runtime itself.
	     //ex: interrupted exception(Thread.sleep:red line comes),
	     //IO:file not found,interruptedIO,EOFE Exception
	     //SQL exception
	     
	     
	 //if try block have more than 1 different exceptions, try to write different(separate) catch blocks instead of handling with one catch block with Exception class.  
	//if your have catch block with exception, we can't have another catch block with AE or NPE like that.
	//in try block the very first exception are handled and never come back to 2nd exception in try block again.
	 
	    
	     //try -> we can not write try alone without catch block(it gives error).
// catch block always associated with try block.
	   public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		
		
		try {  //line which is giving exception is in try block.
		    Employee obj = new Employee();
			obj = null;
			obj.name = "Naveen";  //NPE
			
			int i = 9/0;   //AE
		    System.out.println("hello");  //after the exception line whatever you write it never be executed.
		}
		
//		System.out.println("after try catch block");  //we can not write any statement right after try block .it give error in catch block.

//		catch(Exception e){   //handling the exception in catch block
//			e.printStackTrace();  // this method tell information about exception.
//		}
		

		catch(NullPointerException e){   //handling the exception in catch block
			System.out.println("NPE is coming....");
			e.printStackTrace();  // this method tell information about exception.
		}
		
		catch(ArithmeticException e){   
			System.out.println("AE is coming....");
			e.printStackTrace();  
		}
		System.out.println("Bye");

	}

}
