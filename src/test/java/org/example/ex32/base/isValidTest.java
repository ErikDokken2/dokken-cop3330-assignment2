package org.example.ex32.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isValidTest {

    @Test
    void validDifficulty_True() {
        //given
        isValid checker = new isValid();

        //When
        boolean actual = checker.validDifficulty("3");

        assertTrue(actual);
    }
    @Test
    void validDifficulty_False_By_Big_Num() {
        //given
        isValid checker = new isValid();

        //When
        boolean actual = checker.validDifficulty("5");

        assertFalse(actual);
    }
    @Test
    void validDifficulty_False_By_Char() {
        //given
        isValid checker = new isValid();

        //When
        boolean actual = checker.validDifficulty("q");

        boolean expect = false;
        assertEquals(actual, expect);
    }
    @Test
    void validDifficulty_False_By_BiG_Char() {
        //given
        isValid checker = new isValid();

        //When
        boolean actual = checker.validDifficulty("A");

        boolean expect = false;
        assertEquals(actual, expect);
    }
    @Test
    void validDifficulty_False_By_Special_Char() {
        //given
        isValid checker = new isValid();

        //When
        boolean actual = checker.validDifficulty("(");

        boolean expect = false;
        assertEquals(actual, expect);
    }
}