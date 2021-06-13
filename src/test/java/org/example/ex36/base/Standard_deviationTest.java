package org.example.ex36.base;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
class Standard_deviationTest {

    @Test
    void std() {
        ArrayList list = new ArrayList();

        list.add("100");
        list.add("200");
        list.add("1000");
        list.add("300");

        Standard_deviation test = new Standard_deviation();
        double actual = test.std(list, 400.0,4);
        float roundActual = (float) Math.round(actual*100)/100;
        float expected = (float) 353.55;

        assertEquals(roundActual,expected);
    }
}