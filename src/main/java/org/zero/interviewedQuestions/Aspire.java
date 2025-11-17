package org.zero.interviewedQuestions;

public class Aspire {

	public static void main(String[] args) {

		String one= ("{}{11}{{{{}}");

		int n = one.length();
		
		
		char l ;
		int count1=0, count2=0;
		
		for(int i=0; i<n-1 ; i++){
			
		   char At = one.charAt(i);
		   l=At;
		   
            if (l=='{') {
            	
            	count1++;
            }else if (l=='}') {
            	
            	count2++;
            }else{
            	//System.out.println("how many 1");
            }
		}
		
		System.out.println("Number of Open Brass "+count1);
        System.out.println("Number of Closed Brass "+count2);
        
		System.out.println("                               ");
		System.out.println("In Aspire Interview, you are passed almost near by..."
				+ " Keep try the Next step Success");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
