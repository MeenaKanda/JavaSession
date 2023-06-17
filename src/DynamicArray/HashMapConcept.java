package DynamicArray;

import java.util.HashMap;

public class HashMapConcept {
	
	//collection are dynamic
	
	//ArrayList have only values
	
	//HashMap => is a class
	//HashMap -> dynamic storage
    //HashMap<k,v> :
	//it is used for storing key-value pairs using a hashtable. 
	// 1.store the value on the basis of key and value 
	 //name = naveen
	//marks = 100
	//seller = seller@gmail.com
	
	// 2.does not maintain order at all.
	// 3.it can have multiple(duplicate) key . it always take latest value of multiple same key.
	// 3. All the keys which are stored in a Hashmap are unique. //unique keys allowed
	// 4.it can have multiple duplicate values also.
	// 5.null keys are allowed
	// 6.null values also allowed.
	//not thread safe and not synchronized. 
	
	//put() -> used to add the key and value
	//get() -> used to fetch the value on the basis of key
	

	public static void main(String[] args) {
		
		HashMap<String, String> empMap = new HashMap<String, String>();
		
		empMap.put("Naveen", "SDET");
	 	empMap.put("Amrita", "SDET1");
		empMap.put("Rashmi", "SDET2");
		empMap.put("Ravi", "SDET Manager");
		empMap.put("Karem", "VP");
		empMap.put("Karem", "CEO");
		empMap.put("Karem", "CEO"); // karem key take latest value CEO
		empMap.put("Sheela", null);
		empMap.put(null, "CTO");   //if you don't know key use null
		empMap.put(null, null);  //null key take latest value null // practically we don't use null key and value
		
		
		
		
		System.out.println(empMap.get("Rashmi"));  //SDET2
		System.out.println(empMap.get("Karem"));  //CEO
		System.out.println(empMap.get("Tom"));	  //null
		System.out.println(empMap.get("Sheela")); // null
		System.out.println(empMap.get(null));   //CTO
		System.out.println(empMap.get(null)); //null
		
		
		System.out.println(empMap);  //{Amrita=SDET1, null=null, Sheela=null, Naveen=SDET, Ravi=SDET Manager, Rashmi=SDET2, Karem=CEO}
		//it doesn't maintains the order.maintain random order
		
		
		HashMap<String, Integer> browserMap = new HashMap<String, Integer>();
		
		browserMap.put("chrome", 100);
		browserMap.put("firefox", 90);
		browserMap.put("ie", 7);
		browserMap.put("safari", 10);
		
		System.out.println(browserMap);  //{chrome=100, safari=10, firefox=90, ie=7}
		
	    System.out.println(browserMap.get("firefox"));  //90
	
	
	}

}

//How HashMap works internally?
//put(key, value){
// h =  hashcode(key) chrome-17089
// index = mod(n) -> 3
//}

//In put method, hascode is calculated for key value by java internally, then it will calculate the index in which position we put the pair.

//java can calculate same hashcode for multiple keys ,so get same index also, so the 2nd value go to the same segment(index), this is called collision.

//get(key){
//hashcode(key) 
//index
//}

//put method also find hascode for key and find index , then go find and get respective value.
//before JDK 1.8 -> hashmap was slow to go fetch the value because of collision happen more in single index
//Time complexity -> O(n)

//after JDK 1.8 -> java create threshold concepts , maximum 8 nodes it form, after 8th nodes convert into Binary Tree (BT)
//Time complexity -> O(log n)  -> way faster than O(n)



//Qs: which data structure HashMap represents?
// the hashmap is an implementation of hash table data structure, which is idle for mapping one value to other lide id to name as you can
//search for value in O(1) time if you have key. 










