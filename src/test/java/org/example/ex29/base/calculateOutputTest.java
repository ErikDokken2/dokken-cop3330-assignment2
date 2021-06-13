package org.example.ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculateOutputTest {

    @Test
    void calOutput_1() {
        calculateOutput checker = new calculateOutput();
        //When
        String actual = checker.calOutput(4);
        String expected = "It will take "+ 18 + " years to double your initial investment.";

        assertEquals(expected,actual);
    }
}