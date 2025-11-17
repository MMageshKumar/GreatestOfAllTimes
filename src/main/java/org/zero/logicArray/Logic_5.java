package org.zero.logicArray;

import java.util.Arrays;

public class Logic_5 {
    public static void main(String[] args){

        // Sort / Remove the duplicate value
        // 1. Do Accenting the particular array
        // 2. Copy the not repeated word with same length array (2nd array)
        // 3. Then copy the values from 2nd array to expected length array.

        int[] a= {1,2,1,99,9,99,9};
        int[] b=new int[a.length];
        int m=0;

        Arrays.sort(a);

        // Way 1 - Using Collection class
//        Set <Integer> st=new LinkedHashSet<>();
//        for (int i=0; i<=a.length-1; i++) {
//            st.add(a[i]);
//        }
//        Object[] c=st.toArray();
//        Arrays.toString(c);

        // Way 2 - For loop

        for (int i=0; i<=a.length-2; i++){
            if (a[i] != a[i+1]){
                b[m]=a[i];
                m++;
            }
        }

        b[m]=a[a.length-1];
        m++;

        // Third (Final) array
        int[] c=new int[m];

        for (int i=0; i<=c.length-1; i++){
            c[i]=b[i];
        }

        for (int x:c){
            System.out.println("Removed duplicated from the array = "+x);
        }
    }
}
