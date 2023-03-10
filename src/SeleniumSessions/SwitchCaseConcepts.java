package SeleniumSessions;

public class SwitchCaseConcepts {
	// it will not check each and everyline/cases. directly jump to the exact case and execute
	// at first time switch will decide where exactly it has to jump. compiler will decide where to jump
	public static void main(String[] args) {
		
		String browser = "ie";
		
		switch (browser)  {
		case "chrome":
			System.out.println("chrome is launched");
		    break;   // this break is for break out of entire switch case
		case "firefox":
			System.out.println("firefox is launched");
		    break;
		case "safari":
			System.out.println("safari is launched");
			break;
		case "edge":
			System.out.println("edge is launched");
			break;

		default:
			System.out.println("invalid browser...plz pass the right browser");
			break;
		
		
		case "naveen":
			System.out.println("Naveen is launched");
			
		}
		
		
		//here Switch cannot fit for marks.if else conditon works well.
		int marks = 90;
		switch (marks) {
		case 90:
			System.out.println("grade A");
			break;
		case 80:
			System.out.println("grade B");
			break;
		case 70:
			System.out.println("grade C");
			break;

		default:
			System.out.println("FAIL");
			break;
		}
		
		//we cannot use switchcase statement for floating value and long
		//switch case statement only compatible with integer,byte,short,  char, and string
//		float weight = 75.5f;
//		switch (weight) {
//		case value:
			
//			break;

//		default:
//			break;
//	}
		
	
	//
	char ch = 'a';
	switch (ch) {
	case 'a':
		System.out.println("vowel");
		break;
	case 'e':
		System.out.println("vowel");
		break;
	case 'i':
		System.out.println("vowel");
		break;
	case 'o':
		System.out.println("vowel");
		break;
	case 'u':
		System.out.println("vowel");
		break;


		
	default:
		System.out.println("not a vowel");
		break;
	}
	
	//switch case not allowed -> float, long, double, boolean
	//switch case allow-> byte, short, int, String, char, enum
	byte num = 100;
	switch (num) {
	case 90:
		
		break;

	default:
		break;
	}
	
	
  //real time of switch case:
	//1. cross browser logic
    //2. ecomm - multiple - language
	//3. multi environment: DEV, QA, STAGE, UAT, PROD
	//4. API methods: GET, POST, PUT, DELETE
	//5. DropDown: Single, Multiple, All
	//6. Payment Methods: CC, UPI, PAYPAL, Xoom, Wu, Bank
	
	
	
	}	
}
