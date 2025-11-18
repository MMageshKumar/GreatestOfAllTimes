package org.zero.logicString;

public class Logic4_ReverseWord {
    public static void main(String[] args){

        // Reverse the words inside the String

        String str= "Hello World";

        String[] str_Arr= str.split(" ");

        StringBuilder str_result = new StringBuilder();

        for (String each_word : str_Arr ){
            str_result.append(new StringBuilder(each_word).reverse().append(" "));
        }

        System.out.println(str_result.toString().trim());
    }
}
