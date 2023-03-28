package ru.preutov.strings.camel_case_2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class SolutionTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }

    @Test
    public void testMixedLowerStart() {
        String input = "the_Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }

    @Test
    public void testEmpty() {
        String input = "";
        System.out.println("input: "+input);
        assertEquals("", Solution.toCamelCase(input));
    }
}