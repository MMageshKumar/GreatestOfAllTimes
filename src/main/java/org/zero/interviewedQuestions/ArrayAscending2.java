package org.zero.interviewedQuestions;

import java.util.Arrays;

public class ArrayAscending2 {
	    
	    public static void main (String [] args){
	      
	      int temp;  
	        
	     int a[]={2,8,0,5,9};
	     
	     System.out.println(a.length+"Length");
	     
	     
	     
	     
	     for (int i=0; i<a.length;i++ ){
	         
	         
	         for (int j=i;j<a.length;j++){   // it runs 5*5= 25 times
	             
	             
	             if (a[j]<a[i]){  // both a[i] & a[j] initially have same value
	                 
	                 temp=a[i];
	                 a[i]=a[j];     //intha for loop la eru rotation nadantha athilaye periya value a[0] la store agum.again
	                 a[j]=temp;
	                 
	                 
	             }
	         }
	         
	     }
	         
	         for(int i=0; i<a.length; i++){
	             System.out.println(a[i]);
	         }
	      
	         System.out.println(Arrays.toString(a));
	         
	         
//	          Ascending order *
	         Arrays.parallelSort(a);
	         System.out.println(Arrays.toString(a));
	         
	         Arrays.sort(a);
	         System.out.println(Arrays.toString(a));
	         
//	          Descending order *
	         
	         Integer b []= {2,4,6,1,9};
	         
	         
	         System.out.println(Arrays.toString(b));
	    }
	    
	}


