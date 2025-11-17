package org.zero.a_logicalGames;

public class AmstrongNumber8 {

	public static void main(String[] args) {

		
		int a,j=0,i;
		int m=153;
		a=m;   //--> some case the a value getting changed so, safety purpose using one swapping.
		while(a>0) 
		{		
			i= a % 10;
			j= j+ (i*i*i);
			a= a / 10;
		}
		System.out.println(j);
		
		if (j==m) {
			System.out.println("Amstrong Number");
		}else {
			System.out.println("Not a Amstrong Number");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
