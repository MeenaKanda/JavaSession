package BuilderPattern;

public class UserShopping {
//in ecommorce application and uber we have flow.
	//chaining of methods,we can manipulate any method flow(user flow) according to requirement
	//this way of writing a method is called a builder pattern.
	//each user get different object
	//advantage-> able to achieve builder pattern(chaining of methods),manipulate the direction anywhere in any direction    
	//better readability
	public static void main(String[] args) {
		
         EcommAppllication app = new EcommAppllication();
	
	app.login("naveen@gmail.com", "naveen123")
	.doSearch("mackbook")
	    .addToCart("mackbook pro")
	        .doPayment("1212 1345 2455 4566", 899)
	            .generateOrder()
	                 .logout();
	
	System.out.println("---------------------");
	
	//
	app.login("naveen@gmail.con", "naveen123")
	   .doSearch("tshirt", 5000, "nike")
	      .addToCart(null)
	         .logout();
	
	System.out.println("---------------------");
	
	app.login("naveen@gmail.con", "naveen123")
	    .addToCart("tshirt")
	        .doPayment("naveen234")
	            .generateOrder()
	                 .logout();
	System.out.println("---------------------");
	
	app.login("meena@gmail.con", "meena123")
	    .logout();
	
	
	
//	EcommAppllication app1 = new EcommAppllication();
	
	}

}
