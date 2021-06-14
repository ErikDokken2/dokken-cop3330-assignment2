package org.example.ex38.base;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FilteringValuesTest {

    // Goers threw the program and first filters the odd numbers out and prints out
    //only the even numbers as a string array
    //If False on Number of even then counter was not correct
    //if flase on even even filter not working
    //if given an address you need to change the method output; (Done)
    @Test
    void nullify() {
        FilteringValues test = new FilteringValues();

        String[] input = new String[] {"10","2","3","47"};
        String[] actual = new String[] {};
        actual = test.Nullify(input, 4);

        boolean isTure = actual.equals(input);
        System.out.println(Arrays.toString(actual));

    }
}