package org.zero.logicArray;

public class Logic2_Accenting {
    public static void main(String[] args){
        System.out.println("Hi hello everyone");

        //Accenting and Descending in the Integer array

        int[] a= {3,2,4,5,1};

        for (int i=0; i<=a.length-1; i++){
            for (int j=0; j<=a.length-1; j++){
                if(a[i]<a[j]){
                    int temp = a[j];
                    a[j]= a[i];
                    a[i]= temp;
                }
            }
        }

        //Normal for loop
        for (int i=0; i<a.length; i++ ){
            System.out.println(a[i]);
        };

        // Enhanced for loop
        for (int b:a){
            System.out.println(b);
        }

        //Print the minimum number
        System.out.println("Minimum number is = "+ a[0]);

        //Print the maximum number
        System.out.println("Maximum number is = " + a[a.length-1]);


    }
}
