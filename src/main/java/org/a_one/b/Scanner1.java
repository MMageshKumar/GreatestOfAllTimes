package org.a_one.b;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		
		Scanner w=new Scanner (System.in) ; // This parameter for, we are going to work at console.
		
		System.out.println("Give Magesh Atm pin");
		int one = w.nextInt();
		System.out.println("Magesh ATM pin is "+one);
		
		
		System.out.println("Show Magesh Monthly Salary");
		float two = w.nextFloat();
		System.out.println("Magesh Monthly Salray is "+two);
		
		
		System.out.println("String Zone, that's Red Zone for Scanner");
		String three = w.next();
		System.out.println("My name is "+three);
		
	//	so, this consol reason i going  to next one of NextLine
		
		System.out.println(w.nextLine());  // You did this technique or Create one new Object is better.
		
		System.out.println("Updated String zone");
		String four = w.nextLine();
		System.out.println("My full name is "+four);
		
		
		System.out.println("Charecter Zone, by segregation from string only possible");
		String five = w.next();
		
		char six = five.charAt(0);
		System.out.println("His initial is "+six);
		
		

	}

}
