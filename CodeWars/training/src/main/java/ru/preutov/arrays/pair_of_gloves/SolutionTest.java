package ru.preutov.arrays.pair_of_gloves;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void tests() {
        assertEquals(0, Solution.numberOfPairs(new String[] {}));
        assertEquals(1, Solution.numberOfPairs(new String[] {"red", "red"}));
        assertEquals(0, Solution.numberOfPairs(new String[] {"red", "green", "blue"}));
        assertEquals(3, Solution.numberOfPairs(new String[] {"gray", "black", "purple", "purple", "gray", "black"}));
        assertEquals(4, Solution.numberOfPairs(new String[] {"red", "green", "blue", "blue", "red", "green", "red", "red", "red"}));
    }
}