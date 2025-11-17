package org.a_one.a;

public class Fundamentaltwo {     // Use public ----> Class to class Access possible
	
	public void companyId() {
		System.out.println("Company Id 007");
	}
	
	public void companyName() {
		System.out.println("Company Name Mag Tech");
	}
	
	public void companyContactNumber() {
		System.out.println("M+ 9003554033");
	}

	public static void main(String[] args) {
		
		Fundamentaltwo c=new Fundamentaltwo();
		c.companyId();
		c.companyName();
		c.companyContactNumber();
		System.out.println("--------------------------");
		
		Fundamentalone e=new Fundamentalone();
		e.collegeId();
		e.collegeName();
				
				
	}

}
