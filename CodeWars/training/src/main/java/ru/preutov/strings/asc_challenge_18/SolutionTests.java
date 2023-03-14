package ru.preutov.strings.asc_challenge_18;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTests {

    public static char randomChar() {
        char[] chars =  "qwertyuiopa".toCharArray();
        int randomInt = (int)(10*Math.random());
        return chars[randomInt];
    }


    @Test
    public void testSomething() {
        assertEquals(1, Solution.strCount("Hello", 'o'));
        assertEquals(2, Solution.strCount("Hello", 'l'));
        assertEquals(0, Solution.strCount("",'z'));
    }

    @Test
    public void level2Test() {
        assertEquals(0, Solution.strCount("Library", 'f'));
        assertEquals(6, Solution.strCount("Caaataaas", 'a'));
        assertEquals(0, Solution.strCount("",'z'));
    }

    @Test
    public void randowTest() {
        for (int j=0; j<10; j++ ) {
            int count = 0;
            StringBuilder str = new StringBuilder();
            char check = randomChar();
            for (int i = 0; i < 30; i++) {
                char randChar = randomChar();
                str.append(randChar);
                if (check == randChar) {count++;}
            }
            assertEquals(count, Solution.strCount(str.toString(), check));
        }
    }

}