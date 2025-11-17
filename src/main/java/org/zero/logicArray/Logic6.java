package org.zero.logicArray;

import java.util.Arrays;

public class Logic6 {
    public static void main(String[] args){

        // Add the missing number.

        int[] a={1,2,4,5,6};
        int current_total =0;

        for (int x:a){
             current_total += x;
        }
        System.out.println(current_total);

        //Maximum number is 6. So, 1+2+3+4+5+6 =21 ( max * (max+1)/2 - formula)
        int expected_total = 21;
        int missing_number = expected_total - current_total;
        System.out.println(missing_number);

        int[] b=new int[a.length+1];

        for(int i=0; i<=b.length-2; i++){
            b[i]=a[i];
        }
        b[b.length-1]= missing_number;

        Arrays.sort(b);

        for (Object x:b){
            System.out.println(x);
        }

    }
}
