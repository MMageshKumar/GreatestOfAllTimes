package org.zero.logicString;

import java.io.PrintStream;

public class Logic2 {
    public static void main(String[] args){

        String str= "missisppi";

        char [] charArray= str.toCharArray();

        char [] charArray2= new char[charArray.length];

       int temp = 0;


       for (int i=0; i<=charArray.length-1; i++){

           boolean yes = false;

           for (int j=0; j<=charArray.length-1; j++) {
             if ( charArray2[j]==charArray[i]) {
                 yes = true;
                 break;
             }
           }

           if(yes == false){
               charArray2[temp] = charArray[i];
               temp++;
           }
       }

       for (char x:charArray2){
           System.out.println(x);
       }

    }
}
