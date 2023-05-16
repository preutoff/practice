package ru.preutov.algorithms.range_extraction;

public class Solution {
    public static void main(String[] args) {
        Solution.rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20});
    }

    public static String rangeExtraction(int[] arr) {
        StringBuilder sb = new StringBuilder();
        int bInt = arr[0];
        int eInt = arr[0];
        int prevInt = arr[0];
        for (int i : arr) {
            System.out.println(i);
            if (sb.isEmpty()) {
                sb.append(i);
                prevInt = i;
                bInt = i;
                continue;
            }
            if (i == prevInt + 1) {
                prevInt = i;
                eInt = i;
                continue;
            }
            if (i != prevInt + 1) {
                if (eInt - bInt > 1)
                    sb.append("-").append(eInt);
                if (eInt - bInt == 1)
                    sb.append(",").append(eInt);
                sb.append(",")
                        .append(i);
                prevInt = i;
                bInt = i;
                eInt = i;

            }

        }
        if (eInt - bInt > 1)
            sb.append("-").append(eInt);
        if (eInt - bInt == 1)
            sb.append(",").append(eInt);

        return sb.toString();
    }

}
