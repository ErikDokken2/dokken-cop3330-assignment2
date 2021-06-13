package org.example.ex34.base;

public class Outputs {
    public static String outputString(String[] removeEmployee) {
        int size = removeEmployee.length;
        String output = "";
        output += ("\nThere are "+ size + " employees:\n");
        for(int x = 0; x < size; x++)
        {
            output += (removeEmployee[x] + "\n");
        }
        return output;
    }
}
