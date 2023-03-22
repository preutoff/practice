package ru.preutov.arrays.snakes_ladders;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTests {

    @Test
    public void example() {
        final int[] dice = {2, 1, 5, 1, 5, 4};
        final int[] board = {0, 0, 3, 0, 0, 0, 0, -2, 0, 0, 0};
        assertEquals(10, Dinglemouse.snakesAndLadders(board, dice));
    }

    @Test
    public void randomExample() {
        final int[] dice = {4, 4, 3, 4, 5, 1, 1, 4, 6};
        final int[] board = {0, 0, 0, 0, 0, 9, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 1, 0, 0, 5, 5, 0, 0, 0, 0, 0, -3, 0, 0};
        assertEquals(28, Dinglemouse.snakesAndLadders(board, dice));
    }

    @Test
    public void improovExample2() {

        final int[] dice = {1, 2, 3, 4, 5, 6};
        final int[] board = {0, 5, 0, 0, 0, 0, 0, 0, -4, 0, 0};
        assertEquals(28, Dinglemouse.snakesAndLadders(board, dice));
    }

}