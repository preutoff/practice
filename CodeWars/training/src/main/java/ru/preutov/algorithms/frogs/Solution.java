package ru.preutov.algorithms.frogs;

public class Solution {

    public static void main(String[] args) {
        Solution.white_black_frogs(1);
    }

    public static String white_black_frogs(int n) {
        int dif = (int) Math.pow(n, 2) + 2 * n;
        String intitStr = "w".repeat(n) + "_" + "b".repeat(n);
        StringBuilder result = new StringBuilder();


        int i = 0;


        while (i < dif) {
            int j = i;
//            if (intitStr.contains("wb_")) {
//                intitStr = intitStr.replace("wb_", "_bw");
//                result.append("j");
//                i++;
//            }
            if (intitStr.contains("w_")) {
                intitStr = intitStr.replace("w_", "_w");
                result.append("w");
                i++;
            }
            if (intitStr.contains("wb_")) {
                intitStr = intitStr.replace("wb_", "_bw");
                result.append("j");
                i++;
            }
            if (intitStr.contains("_wb")) {
                intitStr = intitStr.replace("_wb", "bw_");
                result.append("j");
                i++;
            }
            if (intitStr.contains("_b")) {
                intitStr = intitStr.replace("_b", "b_");
                result.append("b");
                i++;
            }


            if (j == i) break;
        }

        return result.toString();
    }



}
