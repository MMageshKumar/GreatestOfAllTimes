package org.zero.logicString;

public class Logic3 {

    public static void main(String[] args){

        String one="RAMAR";

        String reversedStr= "";

        for (int i=one.length()-1;i>=0; i--){
            reversedStr = reversedStr + one.charAt(i);
//            reversedStr += one.charAt(i);
        };
        System.out.println(reversedStr);

    }
}
