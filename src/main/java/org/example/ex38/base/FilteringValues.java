package org.example.ex38.base;

import java.util.ArrayList;

public class FilteringValues {
    private static ArrayList even;

    public String [] makeList(String input) {
        String[] inputList = new String[input.length()];
        int counter = 0;
        for(int x = 0,k = 0; x < input.length();x++)
        {
            if(!String.valueOf(input.charAt(x)).equals(" ") && Integer.parseInt(String.valueOf(input.charAt(x)))> 0 && Integer.parseInt(String.valueOf(input.charAt(x))) <= 9 && input.charAt(x) % 2 == 0)
            {
                counter++;
                inputList[k] = String.valueOf(Integer.parseInt(String.valueOf((input.charAt(x)))));

                k++;
            }
        }
        String[] newArray = new String[counter];
        for (int i = 0, z=0; i < input.length(); i++) {
            if (inputList[i] != null)
            {
                newArray[z] = inputList[i];
                z++;
            }
        }
        inputList = newArray;
        return inputList;
    }
}