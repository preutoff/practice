package ru.preutov.strings.remove_parentheses;

public class Kata {
    public static String removeParentheses(final String str) {
        return str.replaceAll("[\\(].*[\\)]","");
    }
}