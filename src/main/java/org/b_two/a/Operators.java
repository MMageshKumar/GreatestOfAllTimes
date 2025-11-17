package org.b_two.a;

public class Operators {
public static void main(String[] args) {
	
	int age=10, weight=40;     // &----> false tracer      | ---->true tracer
	
	if (age>23 | weight>60) {           // parallel checking
		
		System.out.println("ok athme");	    // physical selection
	}else {
		System.out.println("uneligile");
	}

} 
}
