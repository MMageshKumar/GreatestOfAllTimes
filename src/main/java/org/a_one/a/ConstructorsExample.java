package org.a_one.a;

public class ConstructorsExample {   // same class name methods + object relation so, automatically invoked.
	                                  // and chaining magic also possible here
	
	public ConstructorsExample() {
		
		System.out.println("Default Constructor");
	}
	
	public ConstructorsExample(String brand) {
		
		System.out.println("Brand name is "+ brand );
	}
	
	public ConstructorsExample(int carnumber) {
		
		System.out.println(carnumber);
	}
	
	public static void main(String[] args) {
		
			ConstructorsExample lkg=new ConstructorsExample();
			ConstructorsExample ukg=new ConstructorsExample("volkswagen");
			ConstructorsExample bkg=new ConstructorsExample(1950);

	}

}
