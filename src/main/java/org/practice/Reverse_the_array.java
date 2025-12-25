package org.practice;

import javax.management.MBeanAttributeInfo;
import java.util.*;

public class Reverse_the_array {

    // Leap year and revere the number without using the third variable

    //Lear year
    public void leapYearMethod(int n){

        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
            System.out.println(n + " is the Leap year");
        } else {
            System.out.println(n + " is the not a Leap year");
        }
    }

    public void reverseTheNumber(){

        int number= 13579;

        int i=0;
        int j=0;

        while (number>0){
            i = number%10;
            j = (j*10)+i;
            number = number/10;
        }

        System.out.println(j);
    }

    public void removeSpecialChars(){
        String str= "Welcom*e Home@";

        str = str.replaceAll("[^a-zA-Z ]","");

        System.out.println(str);
    }


    public void reverserTheParticularWord(){

        // I am goint to swap city

        String str= "Magesh kumar from city of Chennai";

        String[] str_arr = str.split(" ");

        StringBuilder str_build= new StringBuilder();

        for (String x: str_arr){
            if (x.equals("city")){
                str_build = str_build.append(new StringBuilder (x).reverse()).append(" ");

            } else {
                str_build = str_build.append(x).append(" ");
            }
        }

        System.out.println(str_build);

    }

    public void swapTheStringWithOutThirdVariable(){

        String str1= "Ragu";
        String str2= "Ram";

        str1 = str1 + str2;

        str2 = str1.substring(0, (str1.length() - str2.length()));
        str1 = str1.substring(str2.length());

        System.out.println(str1+" "+str2);
    }

    public void maxVowelsAtTheWord(){

     String str = "Welcome to Mind Tree company";

     int maxCount = 0;
     String bestString = "";

     for (String x:str.split(" ")){

         int count =0;
         for (Character y : x.toLowerCase().toCharArray()){

             if ("aeiou".indexOf(y) >= 0) {
                 count++;
             }
             }
         if (maxCount < count){
             maxCount = count;
             bestString = x;
         }
     }

     System.out.println(bestString+ maxCount);

    };

    public void nameLetterCount(){
        String str = "Ram Kumar";

        Map <Character, Integer> mp = new LinkedHashMap<>();

        for (Character x: str.toLowerCase().toCharArray()){

            if (x == ' ') continue;

            mp.put(x, mp.getOrDefault(x,0)+1);

        }

        for (Map.Entry <Character,Integer> x: mp.entrySet()){
            System.out.println(x.getKey()+" - "+ x.getValue());
        }

//        System.out.println(mp);
    }

    public void nameLetterCountUsingOneLoops(){
        String str= "ram Kumar";
        char[] str_arr = str.toCharArray();
        char[] str_arr2 = new char[str_arr.length];

        int[] num_arr= new int [str_arr.length];

        char c=' ';
        int count = 0;

        for (int i=0; i<=str_arr.length-1; i++){
            c= str_arr[i];
            if (c == ' ') continue;

            int index = -1;
            for (int j=0; j<=str_arr.length-1; j++) {

                if (str_arr2[j] == c){
                    index = j;
                    break;
                };
        };
            if(index == -1){
                str_arr2 [count] = c;
                num_arr [count] = 1;
                count ++;
            } else {
                num_arr[index]++;
            }

        };
        for (int i=0; i<= str_arr2.length-1; i++) {
            System.out.println(str_arr2[i]+" "+num_arr[i]);
        }
    };


public static void main(String[] args){

        Reverse_the_array obj_r = new Reverse_the_array();

//        obj_r.leapYearMethod(2028);
//        obj_r.reverseTheNumber();
//        obj_r.removeSpecialChars();
//          obj_r.reverserTheParticularWord();
//           obj_r.swapTheStringWithOutThirdVariable();
//    obj_r.maxVowelsAtTheWord();
//    obj_r.nameLetterCount();
    obj_r.nameLetterCountUsingOneLoops();

}
}
