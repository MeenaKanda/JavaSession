package ExceptionHandling;

public class FinalizeConcepts {
	
	
	public void finalize() {    //this method is executed wihtout being called
		System.out.println("finalize method");
	}
	
	

	public static void main(String[] args) {
		
		FinalizeConcepts f1 = new FinalizeConcepts();
		FinalizeConcepts f2 = new FinalizeConcepts();
		
		f1 = null; 
		f2 = null;
		
		System.gc();
		
	}

}


//finalize method is called to perform so clean up processing  before garbage collecting.