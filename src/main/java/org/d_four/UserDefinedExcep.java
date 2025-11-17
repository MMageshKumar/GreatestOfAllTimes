package org.d_four;

public class UserDefinedExcep extends Exception {

	@Override
	public String getMessage() {
		
		// return super.getMessage();-----> change the super keyword only.
	//	System.out.println("Come from user defined class area"); ---> directly give string in return
		return "Come from user defined class area";
	}
	
}
