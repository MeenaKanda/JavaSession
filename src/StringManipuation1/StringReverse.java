package StringManipuation1;

public class StringReverse {
	
	public static String reverseString(String name) {
		//check null first, so if it is null it checked at the beginning, so dont need to enter to other condition.
		//if you pass null , it wont give nullPointerException here.
		if(name == null) {
			System.out.println("null is not allowed...please pass the right value");
			return null;
		}
		
		if(name.length() == 1) {  //when we enter char only//better optimization
		return name;
		}
		
//		String name = "Selenium";
		String rev = "";
		for(int i=name.length()-1; i>=0; i--) {
			rev = rev + name.charAt(i);
		}
	//	System.out.println(rev);
		return rev;
	}

	public static void main(String[] args) {
		String r1 =reverseString("Selenium");
		System.out.println(r1);
		
		r1 =reverseString("Selenium Automation");
		System.out.println(r1);
		
		r1 =reverseString("10011");
		System.out.println(r1);
		
		r1 =reverseString("N");
		System.out.println(r1);  //N
		
		r1 =reverseString("null");
		System.out.println(r1);  //llun
		
		r1 =reverseString(null);
		System.out.println(r1);
		
		r1 =reverseString("TT");
		System.out.println(r1);
		
	}

}
