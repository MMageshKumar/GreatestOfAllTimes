package org.zero.a_logicalGames;

import java.util.Scanner;

public class ReverseTheNumber4 {
	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner jk=new Scanner(System.in);
		
		System.out.println("Please Enter What you want");
		
		Integer a=jk.nextInt();
		
		long  i = 0, j = 0;
		
		while (a > 0) {
		i = a % 10;
		j = (j * 10) + i;           //---------> Finally understanded,
		a = a / 10;

		System.out.println("Reverse number is=" + j);
		}
		System.out.println("Reverse number is=" + j);  // Use of this above line's j--> have a power 
		                                                       // to print a last number
		
			
	}

}
