package org.example.ex27.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatingTest {

    @Test
    void validateInput() {
    Validating checker = new Validating();

    String actual = checker.validateInput("Erik" ,"Dokken", "55555", "AA-1234");
    String expected = "There were no errors found.";

    assertEquals(expected,actual);
}


    @Test
    void validateInput_With_First_Name_Error() {
        Validating checker = new Validating();

        String actual = checker.validateInput("E" ,"Dokken", "55555", "AA-1234");
        String expected = "The first name must be at least 2 characters long.\n";

        assertEquals(expected,actual);
        actual = "";

    }

    @Test
    void validateInput_With_First_Name_Blank_Error() {
        Validating checker1 = new Validating();

        String actual = checker1.validateInput("" ,"Dokken", "55555", "AA-1234");

        String expected1 = "The first name must be at least 2 characters long.\nThe first name must be filled in.\n";

        assertEquals(expected1,actual);

    }
    @Test
    void validateInput_With_Last_Name_Error() {
        Validating checker = new Validating();

        String actual = checker.validateInput("Erik" ,"D", "55555", "AA-1234");
        String expected = "The last name must be at least 2 characters long.\n";

        assertEquals(expected,actual);
        actual = "";

    }

    @Test
    void validateInput_With_Last_Name_Blank_Error() {
        Validating checker = new Validating();

        String actual = checker.validateInput("Erik" ,"", "55555", "AA-1234");

        String expected1 = "The last name must be at least 2 characters long.\nThe last name must be filled in.\n";

        assertEquals(expected1,actual);

    }
    @Test
    void validateInput_With_Zip_False() {
        Validating checker = new Validating();

        String actual = checker.validateInput("Erik" ,"Dokken", "ABCE1", "AA-1234");

        String expected1 = "The zipcode must be a 5 digit number.\n";

        assertEquals(expected1,actual);

    }
    @Test
    void validateInput_With_ID_True() {
        Validating checker = new Validating();

        String actual = checker.validateInput("Erik" ,"Dokken", "12345", "AA-1234");

        String expected1 = "There were no errors found.";

        assertEquals(expected1,actual);

    }
    @Test
    void validateInput_With_ID_False() {
        Validating checker = new Validating();

        String actual = checker.validateInput("Erik" ,"Dokken", "12345", "aa-1234");

        String expected1 = "The employee ID must be in the format of AA-1234\n";

        assertEquals(expected1,actual);

    }
}