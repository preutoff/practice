package ru.preutov.arrays.snakes_ladders;

import static org.junit.Assert.assertEquals;

public class Dinglemouse {

    public static void main(String[] args) {

//        final int[] dice = {2,1,5,1,5,4};
//        final int[] board = {0,0,3,0,0,0,0,-2,0,0,0};

//      random
        final int[] dice = {4, 4, 3, 4, 5, 1, 1, 4, 6};
        final int[] board = {0, 0, 0, 0, 0, 9, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 1, 0, 0, 5, 5, 0, 0, 0, 0, 0, -3, 0, 0};

//        System.out.println("dice:");
//        printArr(dice);
//        System.out.println("board:");
//        printArr(board);


        int r = Dinglemouse.snakesAndLadders(board, dice);
        System.out.printf("Result: %s", r);
    }

    public static int snakesAndLadders(final int[] board, final int[] dice) {
        final int endGame = board.length - 1;
        int position = 0;
        boolean skip = false;
        for (int die : dice) {
            position = move(die, position, endGame, board);
            if (position == endGame) return position;
        }
        return position;
    }

    private static int move(int step, int pos, int endGame, final int[] board) {
        if (step == 0) return pos;
        if (pos == endGame) return pos;
        if (pos + step > endGame) return pos;
        pos = pos + step;
        pos = move(board[pos], pos, endGame, board);
        return pos;
    }

    public static void to_string(final int[] arr) {
        System.out.printf("[");
        for (int i = 0; arr.length > i; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.println("]");

    }

    public static void printArr(final int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; arr.length > i; i++) {
            System.out.printf("(%d,%d) ", i, arr[i]);
        }
        System.out.println("");

    }

}