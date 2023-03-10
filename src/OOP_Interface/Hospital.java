package OOP_Interface;

public class Hospital {

	public void medicalRD() {
		System.out.println("medical R&D");
	}
	
	//if you want to prevent method overriding put final keyword
	public final void medicalNews() {
		System.out.println("medical news");
	}
}
