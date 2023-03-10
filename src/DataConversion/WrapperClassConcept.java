package DataConversion;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x = "100";
		
		System.out.println(x+20); //10020  //concatination
		
		//String to int:
		int i = Integer.parseInt(x);
		System.out.println(i+20);   //120
		
//		Integer -> is a class,not primitive data type
//		parseInt() -> is a method that give you/convert String into integer 

		String y = "100USD";  //alphaNumeric String
		System.out.println(y+20); //100USD20
		
		String curr[] = y.split("USD");
		System.out.println(curr[0]); //100
		int j = Integer.parseInt(curr[0]); 
//		String l = y.replace("USD", "");
//		int j = Integer.parseInt(l);
		System.out.println(j+20);   //  //120
		
		
//		int j = Integer.parseInt(y);  //NumberFormatException
//		System.out.println(j+20);     //NumberFormatException
		//we can not convert alphaNumeric String(100A,100test,100USD) into integer.it give NUmberFormatException in this situation(100USD)
		//it should be pure integer string to convert into integer
		//first use split method(or replace method) and convert(100USD) into integer(100).
		
		//ex: in selenium: in amazon.com  
		//when you read from webpage there is price 100 written ,(when you read from the webpage it is always in the form of string only)
		//the 100 will be given in the form of string.
		//if I want to do calculation with 100 possible? no it is in the form of string. we really need to convert string into int
		//then we can do any arithmetic operation after conversion.
		
		
		System.out.println("----------------");
		
		//String to double:
		String z = "12.33";
		System.out.println(z+20); //12.3320
		
		double d = Double.parseDouble(z);  //convert string to double
		System.out.println(d+20); //32.33
		
		
		//String to boolean:
		String headless = "true";
		
		boolean b =Boolean.parseBoolean(headless);
		if(Boolean.parseBoolean(headless)) {
			System.out.println("run in headless");
		}
		
		
		//int to String:
		int k = 100;
		String k1 =String.valueOf(k); //convert int to String
		System.out.println(k1+20);  //10020
		
		//ex: in Selenium: there is a sendkeys method
		// i really want to enter price on webpage. there is a form which have price.have to enter a price.price is 100.
		//when we supply(passing) data to browser , we cannot supply integer(k=100), because selenium can not take integer value.only accept string value
		//in text field we need to supply text not integer,inn this case we convert integer to string.
	
	
	//  boolean to String:
		boolean flag = true;
		String f1 =String.valueOf(flag);  //true
//		if(f1.equals(f1)) {
//			
//		}
	
	 //
		System.out.println(Integer.MIN_VALUE); //-2147483648
		System.out.println(Integer.MAX_VALUE); //2147483647
		
		System.out.println(Byte.MIN_VALUE); //-128
		System.out.println(Byte.MAX_VALUE); //127
		
		System.out.println(Short.MIN_VALUE); //-32768
		System.out.println(Short.MAX_VALUE); //32767
	
	
	}

}
