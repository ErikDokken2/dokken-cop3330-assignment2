package org.example.ex25.base;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Strength_IndicatorTest {

    @Test
    void password_Strength_returns_1() {
        Strength_Indicator test = new Strength_Indicator();

        //when
        int actual = test.Password_Strength("12345");
        int expected = 1;

        //result
        assertEquals(expected,actual);
    }
    @Test
    void password_Strength_returns_2() {
        Strength_Indicator test = new Strength_Indicator();

        //when
        int actual = test.Password_Strength("abcdef");
        int expected = 2;

        //result
        assertEquals(expected,actual);
    }
    @Test
    void password_Strength_returns_3() {
        Strength_Indicator test = new Strength_Indicator();

        //when
        int actual = test.Password_Strength("abc123xyz");
        int expected = 3;

        //result
        assertEquals(expected,actual);
    }
    @Test
    void password_Strength_returns_4() {
        Strength_Indicator test = new Strength_Indicator();

        //when
        int actual = test.Password_Strength("1337h@xor!");
        int expected = 4;

        //result
        assertEquals(expected,actual);
    }

}