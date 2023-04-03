package ru.preutov.strings.format_words_sentence;

import java.util.stream.Collectors;
import static java.util.stream.Stream.of;

public class Kata {

    public static void main(String[] args) {
//        formatWords(new String[]{"one", "", "three"});
//        formatWords(null);
        formatWords(new String[]{"rte{uwqgy",
                "sgpfwopbk",
                "",
                "wpx",
                "hlxkxbox",
                "",
                "",
                "u{zwv",
                "pe",
                "tggjnnrf{",
                "",
                "iw{xbfd",
                "zkds",
                "vplp",
                "jjvgzmj"});
    }


    public static String formatWords(String[] words) {
        return words == null ? "" : of(words)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.joining(", "))
                .replaceFirst(", (?=\\S*$)", " and ");
        }

    }