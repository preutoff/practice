package ru.preutov.strings.remove_parentheses;

import org.junit.Test;
import ru.preutov.arrays.pair_of_gloves.Solution;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD by writing your own tests

public class SampleTest {
    @Test
    public void basicTests() {
//        assertEquals(0, Kata.removeParentheses());
        for (String[] trial : new String[][]{
                {"example(unwanted thing)example", "exampleexample"},
                {"example(unwanted thing)example", "exampleexample"},
                {"example (unwanted thing) example", "example  example"},
                {"a (bc d)e", "a e"},
                {"a(b(c))", "a"},
                {"hello example (words(more words) here) something", "hello example  something"},
                {"(first group) (second group) (third group)", "  "}})
//            Tester.doTest(trial[0], trial[1]);
        assertEquals(trial[1], Kata.removeParentheses(trial[0]));
    }
}