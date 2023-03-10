package StringManipuation1;

public class StringBuilderAndBufferConcept {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("selenium"); // mutable obj

		// StringBuilder s1 = "Naveen"; // StringBuilder with literals not// allowed.allowed only for String

		sb.append("testing");
		System.out.println(sb); //seleniumtesting

		String s1 = "cypress";   //immutable 
		s1.concat("ui testing");
		System.out.println(s1);  //cypress
		
		
	}

}
