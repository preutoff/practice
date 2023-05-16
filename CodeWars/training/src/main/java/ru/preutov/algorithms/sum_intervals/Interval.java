package ru.preutov.algorithms.sum_intervals;

import java.util.*;

public class Interval {

    public static void main(String[] args) {
        int result = sumIntervals(new int[][]{{1, 5}, {10, 20}, {1, 6}, {16, 19}, {5, 11}});
//        int result = sumIntervals(new int[][]{{-101, 24}, {-35, 27}, {27, 53}, {-105, 20}, {-36, 26},});
//        int result = sumIntervals(new int[][]{{1, 6}, {5, 11},{10, 20},{1, 5},{16, 19}});
//        int result = sumIntervals(new int[][]{
//                {198, 217}, {-50, -48}, {-461, -453}, {334, 338}, {-370, -368}, {77, 81}, {-89, -70}, {219, 221}, {-310, -293}, {309, 326}, {392, 411}, {-111, -109}, {-314, -309}, {248, 249}, {317, 321}, {-65, -48}, {-191, -190}, {-206, -200}
//        });
        System.out.println(result);
    }

    static int sumIntervals(int[][] intervals) {
        int maxEnd = Integer.MIN_VALUE, sum = 0;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        for (int[] interval : intervals) {
            if (interval[1] > maxEnd) {
                sum += interval[1] - Math.max(interval[0], maxEnd);
                maxEnd = interval[1];
            }
        }
        return sum;
    }

}