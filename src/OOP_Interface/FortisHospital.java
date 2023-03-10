package OOP_Interface;

public class FortisHospital extends Hospital implements USMedical, UKMedical, IndianMedical {
	
	int min_fee = 50; // there is no word-> variable overriding. //this is class vars.
	
	// FH has responsibility to provide business logic of USMedical methods.
	// FH have to implement all the methods for USMedical/override all methods from USM
	// if you add any new method in USM , it gives you error in fortis to
	// implement/override the same method in fortis
	// FH can have their own individual methods also.

	// from USMedical
	@Override
	public void cardioServices() {
		System.out.println("FH - cardioService");
	}

	@Override
	public void neuroServices() {
		System.out.println("FH - neuroService");
	}

	@Override
	public void physioServices() {
		System.out.println("FH - physioService");

	}

	// from UKMedical
	@Override
	public void entServices() {
		System.out.println("FH - entService");
	}

	@Override
	public void dentalServices() {
		System.out.println("FH - dentalService");
	}

	// from IndianMedical
	@Override
	public void oncologyServices() {
		System.out.println("FH - oncologyService");
	}

	@Override
	public void gynicServices() {
		System.out.println("FH - gynicService");
	}

	@Override
	public void orthoServices() {
		System.out.println("FH - orthoService");
	}
	
	//common method: 
	//emergencyServices() available in all 3 interfaces. but FH can override only once.because duplicate methods are not allowed in same class.
	@Override
	public void emergencyServices() {
		System.out.println("FH - emergency Services");
	}
	

	// FH individual methods:
	public void medicalTraining() {
		System.out.println("FH - medical Training");
	}
	
	public void medicalInsurance() {
		System.out.println("FH - medical Insurance");
	}

	//from WHO
	@Override
	public void covidVaccination() {
		System.out.println("FH - covidVaccination");
		
	}
 
	//from USHG
	@Override
	public void childCareServices() {
		System.out.println("FH - child care services");
		
	}

	//method hiding:
//	public static void taxCalculation() {  //static method can not be overridden. but can method hiding
//    	System.out.println("FH- taxCalculation");
//	}
	
	
	//override default interface method:
	//we can override default method in child class . but have to remove default and put public instead.little weird.but it is overridden method.
	@Override
	public void getMedicalServices() {  
		 System.out.println("US - getMedicalServices");
	 }
	
}
