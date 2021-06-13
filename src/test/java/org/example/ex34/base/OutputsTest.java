package org.example.ex34.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutputsTest {

    @Test
    void outputString() {
        Outputs checker = new Outputs();
        String[] intput = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String actual = checker.outputString(intput);
        String expected = "\nThere are 5 employees:\n"+"John Smith\n" +
                "Jackie Jackson\n" +
                "Chris Jones\n" +
                "Amanda Cullen\n" +
                "Jeremy Goodwin\n";
        assertEquals(expected,actual);
    }
}