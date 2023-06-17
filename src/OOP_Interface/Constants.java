package OOP_Interface;

public interface Constants {
	
	//by default these are constant variables(final) and static.
    //static final String OK_MESSG_200 = "200 ok request is successfully done";
	
	String OK_MESSG_200 = "200 ok request is successfully done";

    int DEFAULT_TIME_OUT = 20;
    int DEFAULT_PAGE_LOAD_TIME_OUT = 30;
    	
    //what is the advantage of maintaining variable static and final?
    //reusability. instead of writing 200 times. we just reuse it
}
