package ru.preutov.strings.camel_case_2;

import java.lang.StringBuilder;
import java.util.Arrays;

class Solution {

    static String toCamelCase(String s) {
        s = toCamelCaseStr(s);
        return s;
    }

    static String toCamelCaseSB(String s) {
        if (s.length() > 0) {
            String str = s.replace("_", "-");
            StringBuilder sb = new StringBuilder();
            String firstChar = str.substring(0, 1);
            for (String word : str.split("-")) {
                if (word.equals(" ") || word.length() == 0) continue;
                sb.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));
            }

            s = firstChar + sb.substring(1);
        }
        return s;
    }

    static String toCamelCaseStr(String str) {
        String[] words = str.split("[-_]");
        return Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(words[0], String::concat);
    }
}