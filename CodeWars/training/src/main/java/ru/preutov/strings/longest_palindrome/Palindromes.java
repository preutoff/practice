package ru.preutov.strings.longest_palindrome;

public class Palindromes {

    public static void main(String[] args) {

        int r = longestPalindrome("aab");
        System.out.printf("Result: %s", r);
    }


    public static int longestPalindrome(final String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > i; j--) {
                StringBuilder sb = new StringBuilder(s.subSequence(i, j));
                System.out.println(sb);
                if (sb.toString().equals(sb.reverse().toString()) && sb.length() > result) {
                    result = sb.length();
                    break;
                }
            }
        }
        return result;
    }
}