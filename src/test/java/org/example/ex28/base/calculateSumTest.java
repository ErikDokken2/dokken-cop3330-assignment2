package org.example.ex28.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculateSumTest {

    @Test
    void calSum() {
        //Given
        calculateSum checker = new calculateSum();

        //When
        int []inputing = {1,2,3,4,5};
        String actual = checker.calSum(inputing);
        String expected = "The total is 15.";
        //result
        assertEquals(expected,actual);
    }
}