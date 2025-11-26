package org.practice;

import java.util.Arrays;

public class Reverse_the_array {
    public static void main(String[] args) {

        String str1= "Magesh";
        String str2= "Kumar";

        str1 = str1 + str2;

        System.out.println(str1);

        str2 = str1.substring(0,str1.length()-str2.length());
        System.out.println(str2);

        str1 = str1.substring(str2.length());
        System.out.println(str1);
    }

}
