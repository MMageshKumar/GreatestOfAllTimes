package org.practice;

import java.util.Arrays;

public class Reverse_the_array {

    public static int[] reverseTheArray(int[] a) {

        int[] b = new int[a.length];

        int temp = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            b[temp] = a[i];
            temp++;
        }

        for (int x : b) {
            System.out.println(x);
        }
        return b;
    };

    public static String[] reverseTheStringArray(String[] str){
        String temp="";
       for (int i=0; i<str.length/2; i++){
           temp= str[i];
           str[i]=str[str.length-i-1];
          str [str.length-i-1]=temp;
       }

       for(String x:str){
           System.out.println(x);
       }
        return str;
    };

    public static String remove_duplicateFromTheString(String str){

        char[] a=str.toCharArray();
        char[] b=new char[a.length];

        int temp=0;

        for (int i=0; i<=a.length-1; i++){
            for (int j=i; j<=a.length-1; j++) {
                if (a[j] == a[i]) {
                    b[j]=a[i];
                    temp++;
                }
            }
        }

String str2= new String(b);
        System.out.println(str2);


        return str2;
    };


    public static void main(String[] args){
        int[] a= {1,2,3,4,5};
        reverseTheArray(a);

        String[] str={"amin", "guna", "senthil", "anbu"};
        reverseTheStringArray(str);
        remove_duplicateFromTheString("missippi");

        for (int i=1; i<11; i++){

            if (i%2==0){
                System.out.println(i + " is even");
            }else{
                System.out.println(i + " is odd");
            }

        }





    }
}
