package org.example.ex37.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {

    @Test
    void passwordGen() {
        PasswordGenerator test = new PasswordGenerator();
        String actual = test.passwordGen("7","2","2");
        System.out.println(actual);
    }
}