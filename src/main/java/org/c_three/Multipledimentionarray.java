package org.c_three;

import java.util.Arrays;

public class Multipledimentionarray {
	public static void main(String[] args) {
	

	                      //0[6]                1[5]
	int check[][]={{34,35,36,37,38,39},{44,45,46,47,48}}; //Two arrays
	
	int length= check[0].length;
	System.out.println(length);
	
	System.out.println("-------------------");
	
	for (int i=0;i<check.length;i++) {
		System.out.println("-------------------");
		for(int j=0;j<check[i].length;j++) {
			System.out.println(check[i][j]);
		}
	}
	System.out.println("--------------------------------");
	for(int[] x:check) {
		for(int y:x) {
			System.out.println(y);
		}
	}
	
	
	
}}
