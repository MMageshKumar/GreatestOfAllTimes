package org.zero.a_logicalGames;

public class RemoveSpecialCharFromString {
    
    public static void main (String[] args){
        
        //Regex
        // ^ - not - Main
        
        String str="Welcome@ Home!";

//        Way1
//        String str_cleaned = str.replaceAll("[^a-zA-z0-9]","");
//        System.out.println(str_cleaned);

//        Way2
        StringBuilder str_build=new StringBuilder();

        for (int i=0; i<=str.length()-1; i++){
          char str_char = str.charAt(i);
          if(Character.isLetter(str_char) && !Character.isDigit(str_char)){
             str_build = str_build.append(str_char);
          }
        }
           System.out.println(str_build);
    }
}
