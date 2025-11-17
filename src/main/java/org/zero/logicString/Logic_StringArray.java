package org.zero.logicString;

public class Logic_StringArray {
    public static void main(String[] args){

        // Reverse the String Array

        String[] a={"Lizard","Rat","Crocodile","Duck"};

        for(int i=0; i<a.length/2;i++){
           String temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }

        for (String x:a){
            System.out.println(x);
        }

    }
}
