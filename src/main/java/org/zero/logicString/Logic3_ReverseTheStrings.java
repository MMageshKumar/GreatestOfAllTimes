package org.zero.logicString;

public class Logic3_ReverseTheStrings {


    public String reverseTheStringUsingNewString(String givenStr){
        String str=  givenStr; //"RAMAR";
        String reversedStr= "";

        for (int i=str.length()-1;i>=0; i--){
            reversedStr = reversedStr + str.charAt(i);
//            reversedStr += one.charAt(i);
        };
        System.out.println(reversedStr);
        return reversedStr;
    }

    public String reverseTheEachWordInsideTheString(String givenStr){
        // Reverse the words inside the String
        String str= givenStr; //"Hello World";
        String[] str_Arr= str.split(" ");

        StringBuilder str_result = new StringBuilder();

        for (String each_word : str_Arr ){
            str_result.append(new StringBuilder(each_word).reverse().append(" "));
        }
        System.out.println(str_result.toString().trim());
        return str_result.toString();
    };

    public String reverseThePaticularWordInsideTheString(String givenStr, int startIndex, int endIndex){
        // Reverse the words inside the String
        String str= givenStr; //"Hello World";
        String[] str_Arr= str.split(" ");

        StringBuilder str_result = new StringBuilder();

        for (int i = 0; i < str_Arr.length; i++) {
            String word = str_Arr[i];
            if (i >= startIndex && i <= endIndex) {
                str_result.append(new StringBuilder(word).reverse());
            } else {
                str_result.append(word);
            }
            if (i < str_Arr.length - 1) str_result.append(" ");
        }

        System.out.println(str_result.toString().trim());
        return str_result.toString();
    }

    public static void main(String[] args){

        Logic3_ReverseTheStrings obj=new Logic3_ReverseTheStrings();

        obj.reverseTheStringUsingNewString("Jai Sree Ram");

        // Infosys Interview Question
        obj.reverseTheEachWordInsideTheString("Hello world");

        // LTI Interview Question
        obj.reverseThePaticularWordInsideTheString("Magesh kumar coming from Coimbatore", 2, 3);

    }
}
