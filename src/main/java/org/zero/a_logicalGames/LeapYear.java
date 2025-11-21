package org.zero.a_logicalGames;

public class LeapYear {

    public static void main(String[] args){

        int n= 2028;

        if (n%4==0 && n%100!=0 || n%400 ==0){
            System.out.println("Leap year");
        } else {
            System.out.println("Non leap year");
        }

    }
}
