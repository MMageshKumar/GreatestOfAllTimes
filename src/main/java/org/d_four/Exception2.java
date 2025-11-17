package org.d_four;

public class Exception2 {
	
	// predefined exception using-- without knowing exception knowledge-------------------------------
	public void wahid () throws InterruptedException {
	Thread.sleep(2000);
	}
	
	
	
	// predefined exception using our own purpose-----------------------------------------------------
	public void itnan () {
	String man="mani";
	
	if (man.equals("mani")) {
		System.out.println("throw only using inside the method");
	}else {
//		IndexOutOfBoundsException ok=new IndexOutOfBoundsException();
//		throw ok;
		throw new IndexOutOfBoundsException (); // Inga nadantha process-kum intha exception-kum
		}                                           // sammanthame ella, namma vara sonnom.that's all.
	}
	
	
	
	//User defined exception--------------------------------------------------------------------------
      public void thalatha() throws UserDefinedExcep  {
    	  String man="mani";
    		
    		if (man.equals("mai")) {
    			System.out.println("throw only using inside the method 2");
    		}else {
    			throw new UserDefinedExcep() ;
    		}
         	}
	
      
      
      
      
      
	
	public static void main(String[] args) throws InterruptedException, UserDefinedExcep {
		Exception2 aaa=new Exception2();
		
		aaa.wahid();
		
		System.out.println("----------------------------------");
		
		aaa.itnan();
		
		System.out.println("----------------------------------");
		
		aaa.thalatha();

		System.out.println("----------------------------------");
		
		
		
		
		
		
		
		
		
		
	}
}
