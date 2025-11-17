package org.zero.interviewedQuestions;

public class TypeCastingLimits {

	public static void main(String[] args) {


		String one= ("78"+"32");
		
		
		StringBuilder  two=new StringBuilder (one);
		System.out.println(two.reverse());
		
		
		StringBuilder three=two.reverse();
		System.out.println(three+ "Three"); // i don't know why this is not possible--->1
		
		String three2 = three.toString();
		System.out.println(three2+"three2");
		
		String four=new String (two.reverse()) ;
		System.out.println(four+"four");
		
		char five='m'; 
		char wahid='a';
		char itnan='g';
		char [] five2= {five, wahid , itnan};
		Character.toString(five); //---------------------------> 2
		System.out.println(String.valueOf(five+ " five "));//---------> 3
		
		String jpr=new String (five2); //=======================> it's accept the array too.
		System.out.println(jpr);
		
		// Integer class have methods of (int to string to int) 
		
		int six=Integer.parseInt(four); //--------------->4
		System.out.println(six+"six"); 
		
		String seven = Integer.toString(six); //--------->5
		
		
		
		
			
		
	}

}
