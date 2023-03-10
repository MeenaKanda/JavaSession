package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		
		//US - overridden method
		fh.cardioServices();
		fh.neuroServices();
		fh.physioServices();
		
		//UK - overridden method
		fh.entServices();
		fh.dentalServices();
		
		//Indian- overridden method
		fh.oncologyServices();
		fh.gynicServices();
		fh.orthoServices();
		
		//common - overridden
		fh.emergencyServices();
		
		//individual:
		fh.medicalTraining();
		fh.medicalInsurance();
		
		//from Hospital class
		fh.medicalRD();
		fh.medicalNews();
		
		//from WHO
		fh.covidVaccination();
		
		//from USHG
		fh.childCareServices();
		
		//vars:
		System.out.println(fh.min_fee);
		System.out.println(USMedical.min_fee);
		
	//	USMedical.min_fee = 20; //final var cannot be changed.
		
		USMedical.taxCalculation();
	//	FortisHospital.taxCalculation(); //if you want use taxcalulation it should have method hiding.not inheriting
		
	//    fh.getMedicalServices();  //it can inherit before overridden
	    
	    //overridden from US
	    fh.getMedicalServices(); 
	    
	    
	    
		
		//NA - not applicalble
	//	USMedical us = new USMedical(); // can not create the Object of Interface

		
		//top casting:
		//child class object can be referred by parent interface ref variable
		//ref of interface(us) can be created. but can not create the Object of interface.
		//with help of us -> can access only all the overridden method from only US and common method.
		//us -> can not access methods from UK, Indian, individual methods(ref type check failed)
		USMedical us = new FortisHospital();
		
		us.cardioServices();
		us.neuroServices();
		us.physioServices();
		us.emergencyServices();  //common method
		
		//us.entServices(); //can't access overridden method from UK
	
		
		//with help of uk -> can access only all the overridden method from only UK and common method.
		UKMedical uk = new FortisHospital();
		uk.entServices();
		uk.dentalServices();
		uk.emergencyServices(); //common
	
		
		//with help of in -> can access only all the overridden method from only Indian and common method.
		IndianMedical in = new FortisHospital();
		in.oncologyServices();
		in.gynicServices();
		in.orthoServices();
		in.emergencyServices(); //common
		
		// In Interface down casting allowed at compile time?
	//    FortisHospital fh1 = new USMedical(); //give error in compile time itself
		//not allowed .because creating an object for interface is not possible
	    //In case of Interface forget about down casting
	
	
		//use constants:
		System.out.println(Constants.OK_MESSG_200);
		System.out.println(Constants.DEFAULT_TIME_OUT);
		System.out.println(Constants.DEFAULT_PAGE_LOAD_TIME_OUT);
	 
		
		
	}

}
