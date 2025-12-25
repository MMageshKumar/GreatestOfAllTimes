package org.zero.a_logicalGames;

public class Logic1_OddOrEven {
    public static void main(String[] args){

        // Odd number and Even number logic
        for (int a=1; a<10 ; a++){
            if ( a%2 == 0){
                System.out.println(a + " is a even number");
            }else{
                System.out.println(a+ " is a odd number");
            }
        }

        //Swapping the two numbers without third number
        int a=50;
        int b= 100;

        a= a+b;
        b= a-b;
        a= a-b;

        System.out.println("Value of a = "+a+ ", Value of b = " + b);


        //Fibonacci series
           int m=0; int p=1; int temp;

           for (int i=0; i<11 ; i++){
               temp = m + p;
               System.out.println(temp);
               m=p;
               p=temp;
           }

           //Reverse the Integer

        int c= 12345;
//           Int to String
           String d= Integer.toString(c);

           String e= new String("");

           for (int i=d.length()-1; i>=0; i--){
               e += (d.charAt(i));
           }

//           String to Int
          int f =  Integer.parseInt(e);
           System.out.println(f);

    }
}
