package org.d_four;

public class Exception1 {
	
	public static void main(String[] args) {
	
	// Simple arithmetic exception handling------------------------------------------------------
	try {
		System.out.println(6/0);
	}
	catch (ArithmeticException a){
		System.out.println("Catched");
	}
	
	System.out.println("-------------------------------------");
	
	// try catch with finally----------------------------------------------------------------------
	
	try {
		System.out.println(6/0);
	}
	catch (ArithmeticException a){
		System.out.println("Catched");
	}
	finally{
		System.out.println("Finally always work");
	}
	System.out.println("-------------------------------------");
	
	// try with multiple catches-----------------------------------------------------------------
	
	try {
		System.out.println(6/0);
	}
	catch (IndexOutOfBoundsException a){
		System.out.println("1 Catched");
	}
	catch (NullPointerException b){
		System.out.println("2 Catched");
	}
	catch (ArithmeticException c){
		System.out.println("3 Catched");
	}
	catch (Exception d){                 // And that is a parent of all exception, so we declare it, 
		System.out.println("4 Catched");        // first catch another all catch will be wasted.
	}
	System.out.println("All codes Runned");
	
	System.out.println("-------------------------------------");
	
	//try within try------------------------------------------------------------------------------
	
	String man="kumar";
	try {
		System.out.println(man.charAt(7));     // outer try check only one catch when exception, but
	                                            // inner try check both catches.
	     try {
		     System.out.println(6/0);
	         }
	     catch (ArithmeticException a){
		      System.out.println("1 Catched");}
	}
	catch (StringIndexOutOfBoundsException b){
		System.out.println("2 Catched");
	}
	
	
	
	
	
	
	
	
	
	
	
}}
