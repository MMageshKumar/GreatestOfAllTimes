package org.a_one.c;

public class Chromepetarea extends Sanitorium {
	
	public void orderBreakfast() {
		System.out.println("Thosai");
	}

	public void orderTiming() {
		System.out.println("10:00 P.M");
	}
	
	public void orderLocation() {
		System.out.println("some thing 11111");

	}
	
	public static void main(String[] args) {
		 Chromepetarea c=new Chromepetarea ();
		 c.orderBreakfast();
		 c.orderLocation();
		 c.orderTiming();
		 System.out.println("----------------------------");
		 
		 c.orderFood();
		 c.orderArea();
		 c.orderTime();    // This is called as Single inheritance   
		                    //chromepet child
		                  // sanitorium parent
		
		 
	}

}
