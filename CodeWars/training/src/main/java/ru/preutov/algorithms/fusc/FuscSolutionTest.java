package ru.preutov.algorithms.fusc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FuscSolutionTest {
    @Test
    public void tests() {
        assertEquals(0, FuscSolution.fusc(0));
        assertEquals(1, FuscSolution.fusc(1));
        assertEquals(21, FuscSolution.fusc(85));
    }
}

