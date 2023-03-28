package ru.preutov.algorithms.find_parity_outlier;

import org.junit.Test;
import ru.preutov.arrays.snakes_ladders.Dinglemouse;

import static org.junit.Assert.assertEquals;
public class SolutionTest {

    @Test
    public void outlierOdd() {
        final int[] party = {2, 4, 0, 100, 4, 11, 2602, 36};
        assertEquals(11, Solution.getOutliers(party));
    }

    @Test
    public void outlierEven() {
        final int[] party = {160, 3, 1719, 19, 11, 13, -21};
        assertEquals(160, Solution.getOutliers(party));
    }
}
