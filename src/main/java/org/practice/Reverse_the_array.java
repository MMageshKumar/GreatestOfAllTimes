package org.practice;

import java.util.Arrays;
import java.util.*;

public class Reverse_the_array {
    public static void main(String[] args) {

        // Prime numbers
        // Rule is it can be able to divided by 1 or the same number

        int number=11;

        for (int i=2; i<number-1; i++){
            if (number%i == 0){
                System.out.println("Not a Prime number");
                break;
            } else {
                System.out.println("Prime number");
                break;
            }
        }
    }
}
