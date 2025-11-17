package org.c_three;

public class StringSplClass2 {

	public static void main(String[] args) {
		
		//----------Immutable String ---like Literal String------//
		
		String imone="11";
		String imtwo="77";
		String imthree="11";
		
		System.out.println(imone.hashCode());  //----> four digit number
		System.out.println(System.identityHashCode(imone));  //----> near by seven digit number
		
		System.out.println("--------------------");
		
		System.out.println(System.identityHashCode(imtwo));
		
		System.out.println(System.identityHashCode(imthree));
		
		

		
		
		

	}

}
