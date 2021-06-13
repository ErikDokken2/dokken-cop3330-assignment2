package org.example.ex31.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class heart_RateTest {

    @Test
    void karvonen_Heart_Rate() {
        heart_Rate checker = new heart_Rate();

        String actual = checker.karvonen_Heart_Rate("65","22");
        String expected = "55.0%        | 138 bpm\n" +
                "60.0%        | 145 bpm\n" +
                "65.0%        | 151 bpm\n" +
                "70.0%        | 158 bpm\n" +
                "75.0%        | 165 bpm\n" +
                "80.0%        | 171 bpm\n" +
                "85.0%        | 178 bpm\n" +
                "90.0%        | 185 bpm\n" +
                "95.0%        | 191 bpm\n";
        assertEquals(expected,actual);
    }
}