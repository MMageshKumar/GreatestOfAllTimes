package org.zero.a_logicalGames;

public class PalindromNumbers5 {
	
	public static void main(String[] args) {
	
	for(int m=0; m<100; m++){
		
		int a, i=0, j=0;
		
		a=m;
		while(a>0) {
			
			i=a % 10;
			j=(j*10)+i;
			a=a/10;
			
		}
		if (j==m){
			System.out.println(m);  // inga intha rendu numberum mathi potalum ore number varanum na
		}                                      // anga intha rendum equal.(22 mathi potta 22 than)
		                          // mathi potu tharathu j voda velai, athu m-ku equlana print pannu.
		
		
		
	}
	}
}
