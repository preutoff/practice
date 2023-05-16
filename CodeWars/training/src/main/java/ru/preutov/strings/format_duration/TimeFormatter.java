package ru.preutov.strings.format_duration;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class TimeFormatter {
    final static int SEC_IN_MINUTE = 60;
    final static int SEC_IN_HOUR = 60 * SEC_IN_MINUTE;
    final static int SEC_IN_DAY = 24 * SEC_IN_HOUR;
    final static int SEC_IN_YEAR = 365 * SEC_IN_DAY;

    public static void main(String[] args) {

        System.out.println(formatDuration(123));
    }

    public static String formatDuration(int seconds) {
        return seconds == 0 ? "now" :
                Arrays.stream(
                                new String[]{
                                        formatTime("year", (seconds / SEC_IN_YEAR)),
                                        formatTime("day", ((seconds % SEC_IN_YEAR) / SEC_IN_DAY)),
                                        formatTime("hour", ((seconds % SEC_IN_DAY) / SEC_IN_HOUR)),
                                        formatTime("minute", ((seconds % SEC_IN_HOUR) / SEC_IN_MINUTE)),
                                        formatTime("second", (seconds % SEC_IN_MINUTE))}
                        )
                        .filter(e -> !Objects.equals(e, ""))
                        .collect(Collectors.joining(", "))
                        .replaceAll(", (?!.+,)", " and ");
    }

    public static String formatTime(String s, int time) {
        return time == 0 ? "" : time + " " + s + (time == 1 ? "" : "s");
    }
}