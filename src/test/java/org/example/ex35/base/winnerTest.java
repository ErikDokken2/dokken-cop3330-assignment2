package org.example.ex35.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class winnerTest {

    @Test
    void winningIndex_1() {
        winner checker = new winner();
        int actual = checker.winningIndex(1);
        int expected = 1;

        assertEquals(expected,actual);
    }
    @Test
    void winningIndex_2() {
        winner checker = new winner();
        int actual = checker.winningIndex(2);


        assertTrue(actual>=1 && actual <=2);
    }
    @Test
    void winningIndex_4() {
        winner checker = new winner();
        int actual = checker.winningIndex(4);


        assertTrue(actual>=1 && actual <=4);
    }
}