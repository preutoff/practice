package ru.preutov.strings.remove_parentheses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata {
    public static String removeParentheses(String str) {

        Pattern p = Pattern.compile("\\([^()]*\\)");
        Matcher m = p.matcher(str);

        while (m.find()) {
            str = str.replaceAll("\\([^()]*\\)", "");
            m = p.matcher(str);
        }
        return str;
    }
}