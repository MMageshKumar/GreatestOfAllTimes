package org.zero.interviewedQuestions;

public class Aspire2 {

	public static void main(String[] args) { // This is Array Swapping

		
		 int[]  a=new  int [10];
		   
		 //int c[]= {345,123,678}; We can declare the value this way too...
		
		 a[0]=1;
		 a[1]=2;
		 a[2]=3;
		 a[3]=4;
		 a[4]=5;
		 a[5]=6;
		 a[6]=7;
		 a[7]=8;
		 a[8]=9;
		 a[9]=10;
		 
		 
		 
		 int b[]= {0};
		 
		 for(int i=0; i<=9; i++) {
		 //System.out.print(a[i]);
		 }
		 
		 
		for (int i=0; i<3; i++) {
			b[0]=a[0];
			
		for( int j=1; j<10;j++) {  
		a[j-1]=a[j];
//		a[1]=a[2];
//		a[2]=a[3];
//		a[3]=a[4];
//		a[4]=a[5];
//		a[5]=a[6];
//		a[6]=a[7];
//		a[7]=a[8];
//		a[8]=a[9];
//		a[9]=b[0];
		}
		
		a[9]=b[0];
		}
		
		for(int i=0; i<=9; i++) {
			 System.out.print(a[i]+",");
			 }
		
		System.out.println("                               ");
		System.out.println("In Aspire Interview, you are passed almost near by..."
				+ " Keep try the Next step Success");
		
		
		
		
		
		
		
		
		
		
		
	}

}
