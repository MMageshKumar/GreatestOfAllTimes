package org.practice;

import java.util.Arrays;

public class Reverse_the_array {
    public static void main(String[] args) {

        int[] a = {1, 4, 6, 7, 2};
        int temp=0;

        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a.length - 1; j++) {
                if(a[i]<a[j]){
                temp = a[i];
                a[i]=a[j];
                a[j]=temp;
                };
            }
        }

        for(int x:a){
            System.out.println(x);
        }
    }

}
