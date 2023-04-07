package ru.preutov.algorithms.mult3or5;

import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        int res = solution(10);
        System.out.println(res);
    }

    public static int solution(int number) {
        return IntStream.range(0, number)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .sum();
    }
}
