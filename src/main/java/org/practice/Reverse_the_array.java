package org.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;

public class Reverse_the_array {
public static void main(String[] args){

    int a[] = {1,2,3,4,5,7,8,9};

    //n=n*n+1/2
    //5*6= 30/2 = 15

    int total = 0;

    for (int x:a){
        total = total+x;
    };

    int total2 =(a[a.length-1]*(a[a.length-1]+1))/2;
//    System.out.println(total2);

    int actualTotal = total2 - total;
//System.out.println(actualTotal);

    int b[]=new int[a.length+1];

    int temp=0;
    for (int x:a){
        b[temp] = x;
        temp++;
    };

    b[b.length-1] = actualTotal;

    for(int y:b){
        System.out.println(y);
    }

   Arrays.sort(b);

 String c=Arrays.toString(b);
System.out.println(c);

}
}
