package org.practice;

import java.util.Arrays;
import java.util.*;

public class Reverse_the_array {
    public static void main(String[] args) {

        String str1 = "Mageshkumar";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char x : str1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        };


        StringBuilder str_Build=new StringBuilder();
        for (Map.Entry<Character, Integer> y : map.entrySet()) {

           str_Build.append(y.getKey()+"-"+y.getValue()+", ");
        };
        str_Build.setLength(str_Build.length()-2);

        System.out.println(str_Build);
    }
}
