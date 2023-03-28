package ru.preutov.algorithms.frogs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testN_Equals1and2()
    {
        assertEquals("wjw", Solution.white_black_frogs(1));
        assertEquals("wjbjjbjw", Solution.white_black_frogs(2));
    }
}
