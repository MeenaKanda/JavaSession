ewepackage DynamicArrayConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {

	
		public static void main(String[] args) {
			
		//	List<String> namesList = new List<String>();  //it not possible, we can not create obj with I(List)
			
			
			// 1. Writing ArrayList:  //we can pass value by add method only, not directly
			//it is mutable ArrayList , we can add more value anytime.
			List<String> namesList = new ArrayList<String>(); //(Top casting)  //mutable ArrayList

		    namesList.add("Tom");
		    namesList.add("Peter");
		    namesList.add("Rashmi");
		    namesList.add("Ravi");
		    namesList.add("Naveen");
		    
		    //directly print value: it can just print values. no logic can apply here.if you want to print all elements together use this.
		    System.out.println(namesList);  //[Tom, Peter, Rashmi, Ravi, Naveen]
		    System.out.println(namesList.size());  //5
		    
		    
		    // 2.writing ArrayList:
		    //asList() -> helps write all value in  the same line.
		  //asList() -> is a static method.
		   List<String> browserList = Arrays.asList("chrome", "firefox", "IE", "Safari", "Edge");  //immutable ArrayList
		   
		   System.out.println(browserList.size());  //5
		   System.out.println(browserList);   //[chrome, firefox, IE, Safari, Edge]
		   
		  
		   List<Integer> numList = Arrays.asList(100, 200, 300, 400, 500);
		   System.out.println(numList); //[100, 200, 300, 400, 500]
		   
		   numList.add(600);
//		   System.out.println(numList);  //UnsupportedOperationException
		   
		   //convert static array to dynamic array:
		   
		   String country[] = {"India", "USA", "UK", "Brazil", "Germany"}; //static array
		   List<String> countryList = Arrays.asList(country);  //dynamic array
		   System.out.println(countryList);  //[India, USA, UK, Brazil, Germany]
		   
		   countryList.add("France");
	//	   System.out.println(countryList);   //UnsupportedOperationException  //not giving error during compile time, get exception only at runtime.
		     
		   
		   

	}

}

