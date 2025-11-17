package org.c_three;

public class StringSplClass1 {    //--------> January 8 
	public static void main(String[] args) {
		
		String cc="Coca Cola since 1886";
		
		System.out.println(cc.isEmpty());
		
		System.out.println(cc.length());
		
		System.out.println(cc.charAt(5)); //new for get the particular value* 
		
		System.out.println(cc.contains("Cola"));
		
		System.out.println(cc.startsWith("Coc"));
		
		System.out.println(cc.endsWith("86"));
		
		System.out.println(cc.indexOf("a"));
		
		System.out.println(cc.lastIndexOf("a"));
		
		System.out.println(cc.toUpperCase());
		
		System.out.println(cc.toLowerCase());
		
		System.out.println(cc.trim());
		
		System.out.println(cc.substring(10));
		
		System.out.println(cc.substring(10, 14));
		
		System.out.println(cc.replace("C", "K"));
		
		System.out.println(cc.replaceAll("since", "gang"));
		
		
		
		StringBuilder lr=new StringBuilder ("Ram");
		
		System.out.println(lr.reverse());  // ------> this method nor available in Literal string
		
		
		
		String pc="Pepci"; //---------------------------------> Next string entrance
		
		System.out.println(cc.equals(pc));
		
		System.out.println(cc.compareTo(pc));
		
		
		
		
	}

}
