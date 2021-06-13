package org.example.ex28.base;

public class calculateSum {
    public String calSum(int[] inputs) {
        int sum = 0;
        for (int x = 0; x < 5; x++) {
            sum += inputs[x];
        }
        String output = "The total is "+ sum + ".";
        return output;
    }
}
