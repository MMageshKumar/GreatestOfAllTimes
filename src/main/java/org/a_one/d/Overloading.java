package org.a_one.d;

public class Overloading { //overloading polymorphism

    private void empDetails(String nam) {
	System.out.println("Employee name is "+ nam);
    }	
          // Datatype order
    private void empDetails(int a, int b) {
		System.out.println(a+b);
		
	}
    
    private void empDetails(int id, String name1) {
    	System.out.println("Employee name is "+ name1);
    	System.out.println("Employee id is "+ id);
    }
    
    //DT count
    
    private void empDetails(String name, int id, long mobile) {
    	System.out.println("Employee name is "+name);
    	System.out.println("Employee id is "+id);
    	System.out.println("Employee Phone Number is "+mobile);
	}
    
    public static void main(String[] args) {
    	
    	Overloading p=new Overloading(); // create a local variable here
    
    	p.empDetails("jack");
    	System.out.println("----------------");
    	p.empDetails(12, 88);
    	System.out.println("-------------------");
    	p.empDetails(89,"jacky");
    	System.out.println("------------------");
    	p.empDetails("johny", 33, 1234567891l);
	}
}
