package org.a_one.d;
                              // consider like a Canara bank
public class Overriding extends Overriding2 {
	
	 public void saving() {
		System.out.println("Saving account interest is 4%");
	}
     public void loan() {
		System.out.println("Loan account interest is 7%");
	}
     public void emi() {
		System.out.println("EMI account insterest is 6%");
	}
     
     public static void main(String[] args) { //print rbi-->syndicate--->canara one by one
    	 
    	 Overriding3 e=new Overriding ();    // left side inga ullathu (method)
    	                                    // right side poi eduthutu varrathu (Logic)
    	                                    // Ennathan extends key word use pannalum method publick ha erukanum
    	 e.saving();                            // Appo than Overriding Green simple kattum
    	 e.loan();
    	 e.emi();
    	 
    	 System.out.println("----------------------------------------------");
    	 
    	 Overriding2 r=new Overriding();
    	 
    	 r.saving();
    	 r.loan();
    	 r.emi();
    	 
    	 System.out.println("-----------------------------------------------");
    	 
    	 Overriding t= new Overriding();
    	 
    	 t.saving();
    	 t.loan();
    	 t.emi();
    	 
    	 System.out.println("-----------------------------------------------");
	
}}
