package org.example.ex33.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutputTest {

    @Test
    void outputString_Num_Is_1() {
        //given
        Output checker = new Output();

        String actual = checker.outputString(1);
        String expect = "Yes";

        assertEquals(actual, expect);
    }

    @Test
    void outputString_Num_Is_2() {
        //given
        Output checker = new Output();

        String actual = checker.outputString(2);
        String expect = "No";

        assertEquals(actual, expect);
    }

    @Test
    void outputString_Num_Is_3() {
        //given
        Output checker = new Output();

        String actual = checker.outputString(3);
        String expect = "Maybe";

        assertEquals(actual, expect);
    }

    @Test
    void outputString_Num_Is_4() {
        //given
        Output checker = new Output();

        String actual = checker.outputString(4);
        String expect = "Ask again later";

        assertEquals(actual, expect);
    }
}