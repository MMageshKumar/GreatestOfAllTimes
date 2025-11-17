package org.a_one.a;

public class ConstructorsExampleSuper extends ConstructorsExamplethis  {
	
	public ConstructorsExampleSuper () {
		super ("hyundai");        // it is called constructor call 
		System.out.println("Default Constructor Super");
	}
	
	public ConstructorsExampleSuper (String brand) {  // not printed in console
		super (0000);
		System.out.println("Super Brand name is "+ brand );
	}
	
	public ConstructorsExampleSuper (int carnumber) {  // not printed in console
		
		System.out.println("super is carnumber "+carnumber);
	}

	public static void main(String[] args) {
		
		ConstructorsExampleSuper lk=new ConstructorsExampleSuper();
		

	}

}
