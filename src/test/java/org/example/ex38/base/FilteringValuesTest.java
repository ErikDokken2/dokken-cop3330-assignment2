package org.example.ex38.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilteringValuesTest {

    @Test
    void makeList() {
        FilteringValues checker = new FilteringValues();
        String []input = checker.makeList("1 2 3 4 5 6 7 8 9 ");
        String actual = checker.outputString(input);
        String expected = "The even numbers are 2 4 6 8.";
        assertEquals(expected,actual);

    }
}