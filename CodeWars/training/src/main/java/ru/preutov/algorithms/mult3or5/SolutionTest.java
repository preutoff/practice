package ru.preutov.algorithms.mult3or5;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        assertEquals(0, new Solution().solution(-3));
        assertEquals(23, new Solution().solution(10));

    }

}