package SeleniumSessions;

import java.util.Arrays;

public class MainMethodOverloading {
	
	//JVM -> always check do we have main method[public static void main(String[] args)]
	//JVM always go with signature of main method[public static void main(String[] args)]
	//JVM has to pass some parameter (how JVM passing parameter? -> that is command line arguments) --> talk about it later
	//main method , static method, normal method all can be overloaded
	//JVM calling main method which is static so JVM unnecessarily no need to create an object for calling main method
    //in reAal time, we don't overload main method.
	
	public static void main(String []a) {
		System.out.println("hello");
		//System.out.println(a[0]);  //AEOB // 
		System.out.println(Arrays.toString(a));  //[]
		
		
		MainMethodOverloading.main(20);
		MainMethodOverloading.main(20, 30);
		
		
		}

	public static void main(int i) {
		System.out.println(i);
		System.out.println("main 1 param");
		}
	public static void main(int i, int j) {
		System.out.println(i+j);
		System.out.println("main 2 params");
		}
	
}

//why main method is static in nature?
 //main method is available in CMA. so JVM no need to create an object to call main method
//why main method is void?
// It does not return anything.
//why main method is public?
//Public so JVM can easily access main method