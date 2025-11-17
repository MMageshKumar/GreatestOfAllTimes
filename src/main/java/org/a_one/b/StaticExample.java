package org.a_one.b;

public class StaticExample {           // We can call static without object creation & same possible to near by class(with in a project)
	
	public static void product() {
		System.out.println("product name is BUBBLE CUM");

	}
	
	public static void brand() {
		System.out.println("Brand name is Center fresh");

	}
	
	public static void price() {
		System.out.println("one piece 1Rs only");

	}
	public static void main(String[] args) {
		
		product();
		brand();
		price();}
	}
	
class StaticExample2 extends StaticExample {

	public static void main(String[] args) {
		product();
		brand();
		price();
	}
}


