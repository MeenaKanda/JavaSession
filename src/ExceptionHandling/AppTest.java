package ExceptionHandling;

public class AppTest {

	public static void main(String[] args) {
		
		String data = null;
		
		if(data == null) {
//			try {
			throw new ApplicationException("DATANOTFOUNDEXCEPTION");   //during compile time itself know this exception because of throw keyword,so program get terminated
			                                                           //so no statements executed after this exception line statment
//			}
//			catch(Exception e) {
//				System.out.println("catch block");
//				e.printStackTrace();
//			}
//			finally {
//				System.out.println("finally block");
//			}
//		}

		System.out.println("bye AppTest");  //why not coming to this ?  //unreachable statement
		//after throw keyword statement are not reachable
	}

}
 //here we don't need to write try catch. it will be taken care by Exception class internally
//ApplicationException("DATANOTFOUNDEXCEPTION")-> because of this message ApplicationException class will be called and given message and
//the same message given to super keyword and RuntimeExceptin will take care of it. no need to write try catch.



//How to create your own custom Exception?
// 1. first create your own class extending runtimeException, and create const.. and supply(send message)
// 2. whenever you want to throw your own exception use throw keyword 

//along with the throw keyword , we have to create your own custom exception class which extends RuntimeException






