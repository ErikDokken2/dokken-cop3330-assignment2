package org.example.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {
    @Test
    void isAnagram_returns_flase_for_anagrams() {
        //Given
        AnagramChecker checker = new AnagramChecker();

        // When
        boolean actual = checker.isAnagram("notes","note");


        //result
        assertFalse(actual);
    }
    @Test
    void isAnagram_returns_true_for_anagrams() {
        //Given
        AnagramChecker checker = new AnagramChecker();

        // When
        boolean actual = checker.isAnagram("Funeral","Real Fun   ");
        boolean expected = true;

        //result
        assertEquals(expected,actual);
    }

    @Test
    void isAnagram_returns_true_for_anagrams1() {
        //Given
        AnagramChecker checker = new AnagramChecker();

        // When
        boolean actual = checker.isAnagram("difo ","god");
        boolean expected = false;

        //result
        assertEquals(expected,actual);
    }
}