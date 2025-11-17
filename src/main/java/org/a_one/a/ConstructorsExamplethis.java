package org.a_one.a;

public class ConstructorsExamplethis extends ConstructorsExample { // this indicates this class method  
	
    public ConstructorsExamplethis () {
		this ("maruthi");        // it is called constructor call 
		System.out.println("Default Constructor");
	}
	
	public ConstructorsExamplethis (String brand) {
		this (3333);
		System.out.println(" this Brand name is "+ brand );
	}
	
	public ConstructorsExamplethis (int carnumber) {
		
		System.out.println("this car number"+carnumber);
	}
	public static void main(String[] args) {
		
		ConstructorsExamplethis jk=new  ConstructorsExamplethis();
		
		
		

	}

}
