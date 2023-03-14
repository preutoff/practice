package ru.preutov.strings.camel_case;

/*
 * Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or camelCase in Java) for strings.
 * All words must have their first letter capitalized without spaces.
 * */
public class Solution {
    public static String camelCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (String word : str.split(" ")) {
            if (word.equals(" ")||word.length()==0) continue;
            sb.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));
        }

        return sb.toString();
    }
}
