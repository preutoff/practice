package ru.preutov.strings.asc_challenge_18;

public class Solution {
    public static int strCount(String str, char letter) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (letter == str.charAt(i)) {
                cnt++;
            }
        }
        return cnt;
    }
}
