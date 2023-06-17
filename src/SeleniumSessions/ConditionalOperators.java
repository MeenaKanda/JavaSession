package SeleniumSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		// conditional operators : >, >=, <, <=, ==	, !=  
		//conditional operator valid only for primitive data type
		int  i = 10;
		int j = 20;
		//System.out.println(i==j); //false
		//System.out.println(10==10); //true
		
		if(i==j) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}

		if(j>=i) {
			System.out.println("j is greater than i");
		}
		else {
			System.out.println("i is gr than j");
		}
		
		System.out.println("-----------------------------");
		
		int total = 100;
		if(total != 100) {
			System.out.println("bye");
		}
		else {
			System.out.println("Hi");
		}
		
		System.out.println("-----------------------------");
         
		//nested if
		int marks = 101;
		if(marks<=100) {
			System.out.println("valid mark");
			if(marks>=90) {
				System.out.println("grade A");
				if (marks>=95) {
					System.out.println("eligible for scholarship");
					if(marks==100) {
						System.out.println("100% fee waived off");
					}
				}
			}
			else {
				System.out.println("grade B");
			}
		
		}
		else {
			System.out.println("not a valid mark");
		}
		
		System.out.println("-----------------------------");
		
	// if if if if
		//execute all the condition one by one .it consume time if we write 100 conditions
		//condition can be satisfy first or in the middle sill all the line will go and check
		//.equal is a method and it give you boolean.
/*		String browser = "chrome";
		if(browser.equals("chrome")) {
			System.out.println("chrome is launched");
		}
		if(browser.equals("firefox")) {
			System.out.println("firefox is launched");
		}
		if(browser.equals("safari")) {
			System.out.println("safari is launched");
		}
		if(browser.equals("edge")) {
			System.out.println("edge is launched");
		}
	    else {
			System.out.println("invalid browser");   // else also executing here along with if
		}*/
		
		System.out.println("-----------------------------");
		
		//if-elseif
		// once the condition is satisfied it wiil not check remaining conditions.slightly better than previous if if if . but still it is not optimized
		//if condition is satisfied no need to go to else part.
		//now we use switchcase concepts
		String browser = "chrome";
		if(browser.equals("chrome")) {
			System.out.println("chrome is launched");
		}
		else if(browser.equals("firefox")) {
			System.out.println("firefox is launched");
		}
		else if(browser.equals("safari")) {
			System.out.println("safari is launched");
		}
		else if(browser.equals("ie")) {
			System.out.println("ie is launched");
		}
		else {
			System.out.println("invalid browser");
		}
		
	}

}
