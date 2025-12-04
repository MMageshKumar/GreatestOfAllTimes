package org.zero.logicString;

public class Logic4_MostVowelsString {

    // LIT Interview Question

    public static void main(String[] args) {
        String input = "Hey Magesh Welcome to LTI Mind Tree";

        String[] words = input.split(" ");
        String bestWord = "";
        int maxVowels = 0;

        for (String w : words) {
            String cleaned = w.replaceAll("[^A-Za-z]", "");
            int count = 0;
            for (char c : cleaned.toLowerCase().toCharArray()) {
                if ("aeiou".indexOf(c) >= 0) count++;
            }
            if (count > maxVowels) {
                maxVowels = count;
                bestWord = w;
            }
        }

        System.out.println("Word with most vowels: " + bestWord + " (" + maxVowels + ")");
    }
}