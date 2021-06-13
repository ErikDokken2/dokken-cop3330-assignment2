package org.example.ex36.base;

import java.util.ArrayList;

public class Standard_deviation {
    public double std(ArrayList input, double average, int length, int sum)
    {
        double standardDeviation = 0.0;

        for (int i = 0; i < length; i++) {

            standardDeviation = standardDeviation + Math.pow((Double.parseDouble((String) input.get(i)) - average), 2);

        }
        double quo = standardDeviation/length;
       double result = Math.sqrt(quo);

        return result;

    }
}
