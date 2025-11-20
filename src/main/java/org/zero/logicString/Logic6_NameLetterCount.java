package org.zero.logicString;

import java.util.LinkedHashMap;
import java.util.Map;

public class Logic6_NameLetterCount {

    public static void main(String[] args) {

        String str = "Hello World"; // Output: H-1, e-2, l-3, o-5, W-6, r-8, d-10

        Map<Character, Integer> str_map = new LinkedHashMap<>();

        for (char x: str.toCharArray()){
            if (x == ' ') continue;
            str_map.put(x, str_map.getOrDefault(x,0)+1); // scope getOrDefault method
        }

        StringBuilder str_print = new StringBuilder();

        for (Map.Entry<Character, Integer> x: str_map.entrySet()){
         str_print.append(x.getKey()).append('-').append(x.getValue()).append(", ");
        }

        // removing last indexes for remove comma
        str_print.setLength(str_print.length()-2);

        System.out.println(str_print);


        // Without collections

        String str1 = "Hello World";
        char[] characters = new char[str1.length()];
        int[] counts = new int[str1.length()];
        int uniqueCount = 0;

        for (int i = 0; i < str1.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') continue; // Skip spaces

            int index = 0;
            for (int j = 0; j < str1.length(); j++) {
                if (characters[j] == ch) {
                    index = j;
                    break;
                }
            }

            if (index == 0) {
                characters[uniqueCount] = ch;
                counts[uniqueCount] = 1;
                uniqueCount++;
            } else {
                counts[index]++;
            }
        }

        // Print results
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < uniqueCount; i++) {
            output.append(characters[i]).append("-").append(counts[i]);
            if (i < uniqueCount - 1) {
                output.append(", ");
            }
        }

        System.out.println(output);

    }
}
