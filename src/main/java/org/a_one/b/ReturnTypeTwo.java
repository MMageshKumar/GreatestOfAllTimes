package org.a_one.b;

public class ReturnTypeTwo {
	
	int coffee;

	public static void main(String[] args) 
	{
		
		ReturnTypeTwo TestReturn=new ReturnTypeTwo();
		
		TestReturn.prepareCoffee();
		
		System.out.println(TestReturn.coffee); //---> call like this only instant variable only.		
	}

	
	public int prepareCoffee ()
	{
		 
		int sugar=100,milk=300;
		coffee=sugar+milk;
		System.out.println("check one "+ coffee);
		return coffee;	
	}
	
	
	
}
